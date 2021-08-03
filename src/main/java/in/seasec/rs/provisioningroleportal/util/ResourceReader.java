package in.seasec.rs.provisioningroleportal.util;

import in.seasec.rs.provisioningroleportal.ProvisioningRoleCreator;

import java.io.InputStreamReader;
import java.util.Objects;

public class ResourceReader {
    public static final InputStreamReader readResource(String resource) {
        return new InputStreamReader(
                Objects.requireNonNull(
                        ProvisioningRoleCreator.class.getClassLoader().getResourceAsStream(resource)));
    }
}
