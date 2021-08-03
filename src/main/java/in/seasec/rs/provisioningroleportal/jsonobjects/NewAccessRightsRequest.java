package in.seasec.rs.provisioningroleportal.jsonobjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewAccessRightsRequest {
    public static class Application {

        private Integer id;
        private Integer appGroupId;
        private String order;
        private String name;
        private String tag;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAppGroupId() {
            return appGroupId;
        }

        public void setAppGroupId(Integer appGroupId) {
            this.appGroupId = appGroupId;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Application.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("appGroupId");
            sb.append('=');
            sb.append(((this.appGroupId == null) ? "<null>" : this.appGroupId));
            sb.append(',');
            sb.append("order");
            sb.append('=');
            sb.append(((this.order == null) ? "<null>" : this.order));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class ApplicationGroup {

        private Integer id;
        private String name;
        private String tag;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ApplicationGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class Permission {

        private Integer id;
        private Integer applicationId;
        private Integer parentPermissionId;
        private String order;
        private String name;
        private String tag;
        private List<Integer> targetPermissionsIds = null;
        private Properties properties;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getApplicationId() {
            return applicationId;
        }

        public void setApplicationId(Integer applicationId) {
            this.applicationId = applicationId;
        }

        public Integer getParentPermissionId() {
            return parentPermissionId;
        }

        public void setParentPermissionId(Integer parentPermissionId) {
            this.parentPermissionId = parentPermissionId;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public List<Integer> getTargetPermissionsIds() {
            return targetPermissionsIds;
        }

        public void setTargetPermissionsIds(List<Integer> targetPermissionsIds) {
            this.targetPermissionsIds = targetPermissionsIds;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Permission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("applicationId");
            sb.append('=');
            sb.append(((this.applicationId == null) ? "<null>" : this.applicationId));
            sb.append(',');
            sb.append("parentPermissionId");
            sb.append('=');
            sb.append(((this.parentPermissionId == null) ? "<null>" : this.parentPermissionId));
            sb.append(',');
            sb.append("order");
            sb.append('=');
            sb.append(((this.order == null) ? "<null>" : this.order));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("targetPermissionsIds");
            sb.append('=');
            sb.append(((this.targetPermissionsIds == null) ? "<null>" : this.targetPermissionsIds));
            sb.append(',');
            sb.append("properties");
            sb.append('=');
            sb.append(((this.properties == null) ? "<null>" : this.properties));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class Properties {

        private String description;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("description");
            sb.append('=');
            sb.append(((this.description == null) ? "<null>" : this.description));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    private List<Permission> permissions = null;
    private List<Application> applications = null;
    private List<ApplicationGroup> applicationGroups = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public List<ApplicationGroup> getApplicationGroups() {
        return applicationGroups;
    }

    public void setApplicationGroups(List<ApplicationGroup> applicationGroups) {
        this.applicationGroups = applicationGroups;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NewAccessRightsRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("permissions");
        sb.append('=');
        sb.append(((this.permissions == null) ? "<null>" : this.permissions));
        sb.append(',');
        sb.append("applications");
        sb.append('=');
        sb.append(((this.applications == null) ? "<null>" : this.applications));
        sb.append(',');
        sb.append("applicationGroups");
        sb.append('=');
        sb.append(((this.applicationGroups == null) ? "<null>" : this.applicationGroups));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

