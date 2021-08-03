package in.seasec.rs.provisioningroleportal;

import com.google.gson.Gson;
import in.seasec.rs.provisioningroleportal.exceptions.ParentPermissionDoesNotExistException;
import in.seasec.rs.provisioningroleportal.jsonobjects.AccessRightsResponse;
import in.seasec.rs.provisioningroleportal.jsonobjects.NewAccessRightsRequest;
import in.seasec.rs.provisioningroleportal.jsonobjects.NewTargetPermissionRequest;
import in.seasec.rs.provisioningroleportal.util.PortalRestApiUtil;

import static in.seasec.rs.provisioningroleportal.util.ResourceReader.readResource;

public class ProvisioningRoleCreator {

    public static void main(String[] args) throws Exception {

        final String portalHostname = args[0];
        final String portalUsername = args[1];
        final String portalPassword = args[2];
        final String applicationGroupName = args[3];
        final String applicationName = args[4];
        final String permissionName = args[5];
        final String subPermissionName = args[6];
        final String description = args[7];
        final PortalRestApiUtil portalRestApiUtil = new PortalRestApiUtil(portalHostname, portalUsername, portalPassword);

        final int targetPermissionId = createTargetPermission(
                subPermissionName.isEmpty() ? permissionName : subPermissionName,
                portalRestApiUtil);

        createAccessRights(applicationGroupName, applicationName, permissionName, subPermissionName, description, targetPermissionId, portalRestApiUtil);

    }

    private static final int createTargetPermission(String permissionName, PortalRestApiUtil util) {
        Gson gson = new Gson();
        NewTargetPermissionRequest newTargetPermissionRequest =
                gson.fromJson(readResource("NewTargetPermissionRequest.json"), NewTargetPermissionRequest.class);
        newTargetPermissionRequest.setName(permissionName);
        newTargetPermissionRequest.setTag(newTargetPermissionRequest.getTag() + permissionName);
        return util.newTargetPermission(newTargetPermissionRequest).getId();
    }

    private static final void createAccessRights(
            String applicationGroupName,
            String applicationName,
            String permissionName,
            String subPermissionName,
            String description,
            int targetPermissionId,
            PortalRestApiUtil util) throws ParentPermissionDoesNotExistException {
        AccessRightsResponse accessRights = util.getAccessRights();
        Gson gson = new Gson();
        NewAccessRightsRequest request = gson.fromJson(readResource("NewAccessRightsRequest.json"), NewAccessRightsRequest.class);
        request.getApplicationGroups().get(0).setName(applicationGroupName);
        request.getApplicationGroups().get(0).setTag(request.getApplicationGroups().get(0).getTag() + applicationGroupName);
        request.getApplications().get(0).setName(applicationName);
        request.getApplications().get(0).setTag(request.getApplications().get(0).getTag() + applicationName);
        request.getPermissions().get(0).setName(subPermissionName.isEmpty() ? permissionName : subPermissionName);
        request.getPermissions().get(0).setTag(request.getPermissions().get(0).getTag() + (subPermissionName.isEmpty() ? permissionName : subPermissionName));
        request.getPermissions().get(0).getTargetPermissionsIds().clear();
        request.getPermissions().get(0).getTargetPermissionsIds().add(targetPermissionId);
        if (!description.isEmpty())
            request.getPermissions().get(0).getProperties().setDescription(description);
        if (subPermissionName.isEmpty())
            request.getPermissions().get(0).setParentPermissionId(null);
        else request.getPermissions().get(0).getProperties().setDescription(null);
        for (AccessRightsResponse.ApplicationGroup applicationGroup :
                accessRights.getApplicationGroups()) {
            if (applicationGroup.getName().equals(applicationGroupName)) {
                request.getApplications().get(0).setAppGroupId(applicationGroup.getId());
                request.getApplicationGroups().clear();
                for (AccessRightsResponse.Application application :
                        applicationGroup.getApplications()) {
                    if (application.getName().equals(applicationName)) {
                        request.getPermissions().get(0).setApplicationId(application.getId());
                        request.getApplications().clear();
                        if (!subPermissionName.isEmpty()) {
                            for (AccessRightsResponse.Permission permission :
                                    application.getPermissions()) {
                                if (permission.getName().equals(permissionName))
                                    request.getPermissions().get(0).setParentPermissionId(permission.getId());
                            }
                        }
                    }
                }
            }
        }

        if(request.getPermissions().get(0).getParentPermissionId() != null && request.getPermissions().get(0).getParentPermissionId() < 0)
            throw new ParentPermissionDoesNotExistException("Parent permission " + permissionName + " does not exist!");
        util.newAccessRights(request);
    }
}
