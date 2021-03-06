package in.seasec.rs.provisioningroleportal;

import com.google.gson.Gson;
import in.seasec.rs.provisioningroleportal.exceptions.PermissionNotEmptyException;
import in.seasec.rs.provisioningroleportal.jsonobjects.AccessRightsResponse;
import in.seasec.rs.provisioningroleportal.jsonobjects.DeletePermissionRequest;
import in.seasec.rs.provisioningroleportal.util.PortalRestApiUtil;

import java.util.ArrayList;
import java.util.List;

import static in.seasec.rs.provisioningroleportal.util.ResourceReader.readResource;

public class ProvisioningRoleDeleter {

    public static void main(String[] args) throws Exception {
        final String portalHostname = args[0];
        final String portalUsername = args[1];
        final String portalPassword = args[2];
        final String applicationGroupName = args[3];
        final String applicationName = args[4];
        final String permissionName = args[5];
        final String subPermissionName = args[6];
        final boolean forceDelete = args[7].equalsIgnoreCase("true");
        final PortalRestApiUtil portalRestApiUtil = new PortalRestApiUtil(portalHostname, portalUsername, portalPassword);

        List<Integer> targetPermissionIds = deleteAccessRights(
                applicationGroupName,
                applicationName,
                permissionName,
                subPermissionName,
                forceDelete,
                portalRestApiUtil);

        deleteTargetPermissions(targetPermissionIds, portalRestApiUtil);

    }

    private static final List<Integer> deleteAccessRights(
            String applicationGroupName,
            String applicationName,
            String permissionName,
            String subPermissionName,
            boolean forceDelete,
            PortalRestApiUtil util) throws PermissionNotEmptyException {
        List<Integer> targetPermissionIds = new ArrayList<>();
        AccessRightsResponse accessRights = util.getAccessRights();
        Gson gson = new Gson();
        DeletePermissionRequest request = gson.fromJson(readResource("DeletePermissionRequest.json"), DeletePermissionRequest.class);
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
                                            targetPermissionIds.add(subPermission.getTargetPermissionsIds().get(0));
                                            request.getDeleted().get(0).setId(subPermission.getId());
                                        }
                                    }
                                } else {
                                    if (!forceDelete && !permission.getSubPermissions().isEmpty())
                                        throw new PermissionNotEmptyException(
                                                "Target Permission " + permissionName + "(" + permission.getId() + ")  is not empty!");
                                    request.getDeleted().get(0).setId(permission.getId());
                                    targetPermissionIds.add(permission.getTargetPermissionsIds().get(0));
                                    for (AccessRightsResponse.Permission subPermission :
                                            permission.getSubPermissions()) {
                                        targetPermissionIds.add(subPermission.getTargetPermissionsIds().get(0));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        util.deleteAccessRights(request);
        return targetPermissionIds;
    }

    public static final void deleteTargetPermissions(List<Integer> targetPermissionIds, PortalRestApiUtil util) {
        for (int targetPermissionId: targetPermissionIds)
            util.deleteTargetPermission(targetPermissionId);
    }
}
