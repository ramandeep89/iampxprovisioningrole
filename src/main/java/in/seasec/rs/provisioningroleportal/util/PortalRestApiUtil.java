package in.seasec.rs.provisioningroleportal.util;

import in.seasec.rs.provisioningroleportal.jsonobjects.*;
import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class PortalRestApiUtil {
    final private String hostname;

    final private Client client = ClientBuilder.newClient();

    private static final String TARGET_PERMISSION_URI = "https://$host/sigma/rest/admin/targetpermission";
    private static final String ACCESS_RIGHTS_URI = "https://$host/sigma/rest/admin/access";

    public PortalRestApiUtil(String hostname, String username, String password) {
        this.hostname = hostname;

        HttpAuthenticationFeature authenticationFeature = HttpAuthenticationFeature.basic(username, password);
        client.register(authenticationFeature);
    }

    public NewTargetPermissionResponse newTargetPermission(final NewTargetPermissionRequest request) {
        WebTarget webTarget = client.target(TARGET_PERMISSION_URI.replace("$host", hostname));
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON_TYPE));

        return response.readEntity(NewTargetPermissionResponse.class);
    }

    public int newAccessRights(final NewAccessRightsRequest request) {
        WebTarget webTarget = client.target(ACCESS_RIGHTS_URI.replace("$host", hostname));
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON_TYPE));
        return response.getStatus();
    }

    public AccessRightsResponse getAccessRights() {
        WebTarget webTarget = client.target(ACCESS_RIGHTS_URI.replace("$host", hostname));
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.get();

        return response.readEntity(AccessRightsResponse.class);
    }

    public int deleteAccessRights(final DeletePermissionRequest request) {
        WebTarget webTarget = client.target(ACCESS_RIGHTS_URI.replace("$host", hostname));
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON_TYPE));
        return response.getStatus();
    }

    public int deleteTargetPermission(final int targetPermissionId) {
        WebTarget webTarget = client.target(TARGET_PERMISSION_URI.replace("$host", hostname) + "/" + targetPermissionId);
        Invocation.Builder invocationBuilder = webTarget.request();
        Response response = invocationBuilder.delete();
        return response.getStatus();
    }
}
