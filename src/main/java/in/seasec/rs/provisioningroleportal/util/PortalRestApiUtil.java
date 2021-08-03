package in.seasec.rs.provisioningroleportal.util;

import in.seasec.rs.provisioningroleportal.jsonobjects.*;
import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class PortalRestApiUtil {
    final private String hostname;

    final private Client client;

    public static Client ignoreSSLClient() throws Exception {

        SSLContext sslcontext = SSLContext.getInstance("TLS");

        sslcontext.init(null, new TrustManager[]{new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }}, new java.security.SecureRandom());

        return ClientBuilder.newBuilder()
                .sslContext(sslcontext)
                .hostnameVerifier((s1, s2) -> true)
                .build();
    }

    private static final String TARGET_PERMISSION_URI = "https://$host/sigma/rest/admin/targetpermission";
    private static final String ACCESS_RIGHTS_URI = "https://$host/sigma/rest/admin/access";

    public PortalRestApiUtil(String hostname, String username, String password) throws Exception {
        this.hostname = hostname;

        HttpAuthenticationFeature authenticationFeature = HttpAuthenticationFeature.basic(username, password);
        client = ignoreSSLClient();
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
