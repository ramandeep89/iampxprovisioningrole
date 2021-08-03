package in.seasec.rs.provisioningroleportal;

import com.google.gson.Gson;
import in.seasec.rs.provisioningroleportal.exceptions.PermissionNotEmptyException;
import in.seasec.rs.provisioningroleportal.jsonobjects.AccessRightsResponse;
import in.seasec.rs.provisioningroleportal.jsonobjects.NewAccessRightsRequest;
import in.seasec.rs.provisioningroleportal.util.PortalRestApiUtil;

import static in.seasec.rs.provisioningroleportal.util.ResourceReader.readResource;

public class ProvisioningRoleModifier {
    public static void main(String[] args) {
        final String portalHostname = args[0];
        final String portalUsername = args[1];
        final String portalPassword = args[2];
        final String applicationGroupName = args[3];
        final String applicationName = args[4];
        final String permissionName = args[5];
        final String subPermissionName = args[6];
        final String description = args[7];
        final PortalRestApiUtil portalRestApiUtil = new PortalRestApiUtil(portalHostname, portalUsername, portalPassword);
        modifiyAccessRights(applicationGroupName, applicationName, permissionName, subPermissionName, description, portalRestApiUtil);

    }

    private static final void modifiyAccessRights(
            String applicationGroupName,
            String applicationName,
            String permissionName,
            String subPermissionName,
            String description,
            PortalRestApiUtil util) {
        AccessRightsResponse accessRights = util.getAccessRights();
        Gson gson = new Gson();
        NewAccessRightsRequest request = gson.fromJson(readResource("NewAccessRightsRequest.json"), NewAccessRightsRequest.class);
        request.getApplicationGroups().clear();
        request.getApplications().clear();
        for (AccessRightsResponse.ApplicationGroup applicationGroup :
                accessRights.getApplicationGroups()) {
            if (applicationGroup.getName().equals(applicationGroupName)) {
                for (AccessRightsResponse.Application application :
                        applicationGroup.getApplications()) {
                    if (application.getName().equals(applicationName)) {
                        for (AccessRightsResponse.Permission permission :
                                application.getPermissions()) {
                            if (permission.getName().equals(permissionName)) {
                                if (!subPermissionName.isEmpty()) {
                                    for (AccessRightsResponse.Permission subPermission :
                                            permission.getSubPermissions()) {
                                        if (subPermission.getName().equals(subPermissionName)) {
                                            request.getPermissions().get(0).setId(subPermission.getId());
                                            request.getPermissions().get(0).setApplicationId(subPermission.getApplicationId());
                                            request.getPermissions().get(0).setName(subPermission.getName());
                                            request.getPermissions().get(0).setOrder(subPermission.getOrder());
                                            request.getPermissions().get(0).getProperties().setDescription(description);
                                            request.getPermissions().get(0).getTargetPermissionsIds().addAll(subPermission.getTargetPermissionsIds());
                                            request.getPermissions().get(0).setParentPermissionId(permission.getId());
                                        }
                                    }
                                } else {
                                    request.getPermissions().get(0).setId(permission.getId());
                                    request.getPermissions().get(0).setApplicationId(permission.getApplicationId());
                                    request.getPermissions().get(0).setName(permission.getName());
                                    request.getPermissions().get(0).setOrder(permission.getOrder());
                                    request.getPermissions().get(0).getProperties().setDescription(description);
                                    request.getPermissions().get(0).getTargetPermissionsIds().addAll(permission.getTargetPermissionsIds());
                                    request.getPermissions().get(0).setParentPermissionId(null);
                                }
                            }
                        }
                    }
                }
            }
        }

        util.newAccessRights(request);
    }
}
