package in.seasec.rs.provisioningroleportal.jsonobjects;

import java.util.List;

public class AccessRightsResponse {
    private List<ApplicationGroup> applicationGroups = null;
    private List<TargetPermission> targetPermissions = null;
    private List<ExecutionPlan> executionPlans = null;

    public List<ApplicationGroup> getApplicationGroups() {
        return applicationGroups;
    }

    public void setApplicationGroups(List<ApplicationGroup> applicationGroups) {
        this.applicationGroups = applicationGroups;
    }

    public List<TargetPermission> getTargetPermissions() {
        return targetPermissions;
    }

    public void setTargetPermissions(List<TargetPermission> targetPermissions) {
        this.targetPermissions = targetPermissions;
    }

    public List<ExecutionPlan> getExecutionPlans() {
        return executionPlans;
    }

    public void setExecutionPlans(List<ExecutionPlan> executionPlans) {
        this.executionPlans = executionPlans;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccessRightsResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationGroups");
        sb.append('=');
        sb.append(((this.applicationGroups == null) ? "<null>" : this.applicationGroups));
        sb.append(',');
        sb.append("targetPermissions");
        sb.append('=');
        sb.append(((this.targetPermissions == null) ? "<null>" : this.targetPermissions));
        sb.append(',');
        sb.append("executionPlans");
        sb.append('=');
        sb.append(((this.executionPlans == null) ? "<null>" : this.executionPlans));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public static class ApplicationGroup {

        private Integer id;
        private Object clientId;
        private String name;
        private String tag;
        private String type;
        private Object order;
        private List<Application> applications = null;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getClientId() {
            return clientId;
        }

        public void setClientId(Object clientId) {
            this.clientId = clientId;
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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getOrder() {
            return order;
        }

        public void setOrder(Object order) {
            this.order = order;
        }

        public List<Application> getApplications() {
            return applications;
        }

        public void setApplications(List<Application> applications) {
            this.applications = applications;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ApplicationGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("clientId");
            sb.append('=');
            sb.append(((this.clientId == null) ? "<null>" : this.clientId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("type");
            sb.append('=');
            sb.append(((this.type == null) ? "<null>" : this.type));
            sb.append(',');
            sb.append("order");
            sb.append('=');
            sb.append(((this.order == null) ? "<null>" : this.order));
            sb.append(',');
            sb.append("applications");
            sb.append('=');
            sb.append(((this.applications == null) ? "<null>" : this.applications));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class ExecutionPlan {

        private Integer id;
        private Object clientId;
        private String name;
        private String tag;
        private Integer connectorId;
        private Object useCaseId;
        private List<Rule> rules = null;
        private String runMode;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getClientId() {
            return clientId;
        }

        public void setClientId(Object clientId) {
            this.clientId = clientId;
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

        public Integer getConnectorId() {
            return connectorId;
        }

        public void setConnectorId(Integer connectorId) {
            this.connectorId = connectorId;
        }

        public Object getUseCaseId() {
            return useCaseId;
        }

        public void setUseCaseId(Object useCaseId) {
            this.useCaseId = useCaseId;
        }

        public List<Rule> getRules() {
            return rules;
        }

        public void setRules(List<Rule> rules) {
            this.rules = rules;
        }

        public String getRunMode() {
            return runMode;
        }

        public void setRunMode(String runMode) {
            this.runMode = runMode;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutionPlan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("clientId");
            sb.append('=');
            sb.append(((this.clientId == null) ? "<null>" : this.clientId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("connectorId");
            sb.append('=');
            sb.append(((this.connectorId == null) ? "<null>" : this.connectorId));
            sb.append(',');
            sb.append("useCaseId");
            sb.append('=');
            sb.append(((this.useCaseId == null) ? "<null>" : this.useCaseId));
            sb.append(',');
            sb.append("rules");
            sb.append('=');
            sb.append(((this.rules == null) ? "<null>" : this.rules));
            sb.append(',');
            sb.append("runMode");
            sb.append('=');
            sb.append(((this.runMode == null) ? "<null>" : this.runMode));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class TargetPermission {

        private Integer id;
        private Object clientId;
        private String name;
        private String tag;
        private Object backendUniqueName;
        private Integer connectorId;
        private String modType;
        private String type;
        private Object value;
        private Integer executionPlanId;
        private Object bulkExecutionPlanId;
        private Object supportedActions;
        private List<Object> complianceTargetPermissions = null;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getClientId() {
            return clientId;
        }

        public void setClientId(Object clientId) {
            this.clientId = clientId;
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

        public Object getBackendUniqueName() {
            return backendUniqueName;
        }

        public void setBackendUniqueName(Object backendUniqueName) {
            this.backendUniqueName = backendUniqueName;
        }

        public Integer getConnectorId() {
            return connectorId;
        }

        public void setConnectorId(Integer connectorId) {
            this.connectorId = connectorId;
        }

        public String getModType() {
            return modType;
        }

        public void setModType(String modType) {
            this.modType = modType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Integer getExecutionPlanId() {
            return executionPlanId;
        }

        public void setExecutionPlanId(Integer executionPlanId) {
            this.executionPlanId = executionPlanId;
        }

        public Object getBulkExecutionPlanId() {
            return bulkExecutionPlanId;
        }

        public void setBulkExecutionPlanId(Object bulkExecutionPlanId) {
            this.bulkExecutionPlanId = bulkExecutionPlanId;
        }

        public Object getSupportedActions() {
            return supportedActions;
        }

        public void setSupportedActions(Object supportedActions) {
            this.supportedActions = supportedActions;
        }

        public List<Object> getComplianceTargetPermissions() {
            return complianceTargetPermissions;
        }

        public void setComplianceTargetPermissions(List<Object> complianceTargetPermissions) {
            this.complianceTargetPermissions = complianceTargetPermissions;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(TargetPermission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("clientId");
            sb.append('=');
            sb.append(((this.clientId == null) ? "<null>" : this.clientId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("backendUniqueName");
            sb.append('=');
            sb.append(((this.backendUniqueName == null) ? "<null>" : this.backendUniqueName));
            sb.append(',');
            sb.append("connectorId");
            sb.append('=');
            sb.append(((this.connectorId == null) ? "<null>" : this.connectorId));
            sb.append(',');
            sb.append("modType");
            sb.append('=');
            sb.append(((this.modType == null) ? "<null>" : this.modType));
            sb.append(',');
            sb.append("type");
            sb.append('=');
            sb.append(((this.type == null) ? "<null>" : this.type));
            sb.append(',');
            sb.append("value");
            sb.append('=');
            sb.append(((this.value == null) ? "<null>" : this.value));
            sb.append(',');
            sb.append("executionPlanId");
            sb.append('=');
            sb.append(((this.executionPlanId == null) ? "<null>" : this.executionPlanId));
            sb.append(',');
            sb.append("bulkExecutionPlanId");
            sb.append('=');
            sb.append(((this.bulkExecutionPlanId == null) ? "<null>" : this.bulkExecutionPlanId));
            sb.append(',');
            sb.append("supportedActions");
            sb.append('=');
            sb.append(((this.supportedActions == null) ? "<null>" : this.supportedActions));
            sb.append(',');
            sb.append("complianceTargetPermissions");
            sb.append('=');
            sb.append(((this.complianceTargetPermissions == null) ? "<null>" : this.complianceTargetPermissions));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class Application {

        private Integer id;
        private Object clientId;
        private String name;
        private String tag;
        private String order;
        private Integer appGroupId;
        private Properties properties;
        private List<Permission> permissions = null;
        private List<Object> permissionGroups = null;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getClientId() {
            return clientId;
        }

        public void setClientId(Object clientId) {
            this.clientId = clientId;
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

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public Integer getAppGroupId() {
            return appGroupId;
        }

        public void setAppGroupId(Integer appGroupId) {
            this.appGroupId = appGroupId;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        public List<Permission> getPermissions() {
            return permissions;
        }

        public void setPermissions(List<Permission> permissions) {
            this.permissions = permissions;
        }

        public List<Object> getPermissionGroups() {
            return permissionGroups;
        }

        public void setPermissionGroups(List<Object> permissionGroups) {
            this.permissionGroups = permissionGroups;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Application.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("clientId");
            sb.append('=');
            sb.append(((this.clientId == null) ? "<null>" : this.clientId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("order");
            sb.append('=');
            sb.append(((this.order == null) ? "<null>" : this.order));
            sb.append(',');
            sb.append("appGroupId");
            sb.append('=');
            sb.append(((this.appGroupId == null) ? "<null>" : this.appGroupId));
            sb.append(',');
            sb.append("properties");
            sb.append('=');
            sb.append(((this.properties == null) ? "<null>" : this.properties));
            sb.append(',');
            sb.append("permissions");
            sb.append('=');
            sb.append(((this.permissions == null) ? "<null>" : this.permissions));
            sb.append(',');
            sb.append("permissionGroups");
            sb.append('=');
            sb.append(((this.permissionGroups == null) ? "<null>" : this.permissionGroups));
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
        private Object clientId;
        private String name;
        private String tag;
        private String order;
        private Object owner;
        private Object admin;
        private Integer applicationId;
        private Object parentPermissionId;
        private Object permissionGroupId;
        private String statisticsStatus;
        private Properties properties;
        private List<Object> statisticsCategoryIds = null;
        private List<Object> strongAuthIds = null;
        private List<Object> links = null;
        private List<Integer> targetPermissionsIds = null;
        private List<Permission> subPermissions = null;
        private List<Object> subPermissionGroups = null;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getClientId() {
            return clientId;
        }

        public void setClientId(Object clientId) {
            this.clientId = clientId;
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

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public Object getOwner() {
            return owner;
        }

        public void setOwner(Object owner) {
            this.owner = owner;
        }

        public Object getAdmin() {
            return admin;
        }

        public void setAdmin(Object admin) {
            this.admin = admin;
        }

        public Integer getApplicationId() {
            return applicationId;
        }

        public void setApplicationId(Integer applicationId) {
            this.applicationId = applicationId;
        }

        public Object getParentPermissionId() {
            return parentPermissionId;
        }

        public void setParentPermissionId(Object parentPermissionId) {
            this.parentPermissionId = parentPermissionId;
        }

        public Object getPermissionGroupId() {
            return permissionGroupId;
        }

        public void setPermissionGroupId(Object permissionGroupId) {
            this.permissionGroupId = permissionGroupId;
        }

        public String getStatisticsStatus() {
            return statisticsStatus;
        }

        public void setStatisticsStatus(String statisticsStatus) {
            this.statisticsStatus = statisticsStatus;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        public List<Object> getStatisticsCategoryIds() {
            return statisticsCategoryIds;
        }

        public void setStatisticsCategoryIds(List<Object> statisticsCategoryIds) {
            this.statisticsCategoryIds = statisticsCategoryIds;
        }

        public List<Object> getStrongAuthIds() {
            return strongAuthIds;
        }

        public void setStrongAuthIds(List<Object> strongAuthIds) {
            this.strongAuthIds = strongAuthIds;
        }

        public List<Object> getLinks() {
            return links;
        }

        public void setLinks(List<Object> links) {
            this.links = links;
        }

        public List<Integer> getTargetPermissionsIds() {
            return targetPermissionsIds;
        }

        public void setTargetPermissionsIds(List<Integer> targetPermissionsIds) {
            this.targetPermissionsIds = targetPermissionsIds;
        }

        public List<Permission> getSubPermissions() {
            return subPermissions;
        }

        public void setSubPermissions(List<Permission> subPermissions) {
            this.subPermissions = subPermissions;
        }

        public List<Object> getSubPermissionGroups() {
            return subPermissionGroups;
        }

        public void setSubPermissionGroups(List<Object> subPermissionGroups) {
            this.subPermissionGroups = subPermissionGroups;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Permission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("clientId");
            sb.append('=');
            sb.append(((this.clientId == null) ? "<null>" : this.clientId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("tag");
            sb.append('=');
            sb.append(((this.tag == null) ? "<null>" : this.tag));
            sb.append(',');
            sb.append("order");
            sb.append('=');
            sb.append(((this.order == null) ? "<null>" : this.order));
            sb.append(',');
            sb.append("owner");
            sb.append('=');
            sb.append(((this.owner == null) ? "<null>" : this.owner));
            sb.append(',');
            sb.append("admin");
            sb.append('=');
            sb.append(((this.admin == null) ? "<null>" : this.admin));
            sb.append(',');
            sb.append("applicationId");
            sb.append('=');
            sb.append(((this.applicationId == null) ? "<null>" : this.applicationId));
            sb.append(',');
            sb.append("parentPermissionId");
            sb.append('=');
            sb.append(((this.parentPermissionId == null) ? "<null>" : this.parentPermissionId));
            sb.append(',');
            sb.append("permissionGroupId");
            sb.append('=');
            sb.append(((this.permissionGroupId == null) ? "<null>" : this.permissionGroupId));
            sb.append(',');
            sb.append("statisticsStatus");
            sb.append('=');
            sb.append(((this.statisticsStatus == null) ? "<null>" : this.statisticsStatus));
            sb.append(',');
            sb.append("properties");
            sb.append('=');
            sb.append(((this.properties == null) ? "<null>" : this.properties));
            sb.append(',');
            sb.append("statisticsCategoryIds");
            sb.append('=');
            sb.append(((this.statisticsCategoryIds == null) ? "<null>" : this.statisticsCategoryIds));
            sb.append(',');
            sb.append("strongAuthIds");
            sb.append('=');
            sb.append(((this.strongAuthIds == null) ? "<null>" : this.strongAuthIds));
            sb.append(',');
            sb.append("links");
            sb.append('=');
            sb.append(((this.links == null) ? "<null>" : this.links));
            sb.append(',');
            sb.append("targetPermissionsIds");
            sb.append('=');
            sb.append(((this.targetPermissionsIds == null) ? "<null>" : this.targetPermissionsIds));
            sb.append(',');
            sb.append("subPermissions");
            sb.append('=');
            sb.append(((this.subPermissions == null) ? "<null>" : this.subPermissions));
            sb.append(',');
            sb.append("subPermissionGroups");
            sb.append('=');
            sb.append(((this.subPermissionGroups == null) ? "<null>" : this.subPermissionGroups));
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("description");
            sb.append('=');
            sb.append(((this.description == null) ? "<null>" : this.description));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

    public static class Rule {

        private Integer id;
        private Object clientId;
        private String name;
        private Integer priority;
        private String expression;
        private Integer executionRulesId;
        private Integer addForm;
        private Integer removeForm;
        private Object modifyForm;
        private Object addBulkForm;
        private Object removeBulkForm;
        private Object modifyBulkForm;
        private String mode;
        private Boolean addSupported;
        private Boolean modifySupported;
        private Boolean removeSupported;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getClientId() {
            return clientId;
        }

        public void setClientId(Object clientId) {
            this.clientId = clientId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getExpression() {
            return expression;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

        public Integer getExecutionRulesId() {
            return executionRulesId;
        }

        public void setExecutionRulesId(Integer executionRulesId) {
            this.executionRulesId = executionRulesId;
        }

        public Integer getAddForm() {
            return addForm;
        }

        public void setAddForm(Integer addForm) {
            this.addForm = addForm;
        }

        public Integer getRemoveForm() {
            return removeForm;
        }

        public void setRemoveForm(Integer removeForm) {
            this.removeForm = removeForm;
        }

        public Object getModifyForm() {
            return modifyForm;
        }

        public void setModifyForm(Object modifyForm) {
            this.modifyForm = modifyForm;
        }

        public Object getAddBulkForm() {
            return addBulkForm;
        }

        public void setAddBulkForm(Object addBulkForm) {
            this.addBulkForm = addBulkForm;
        }

        public Object getRemoveBulkForm() {
            return removeBulkForm;
        }

        public void setRemoveBulkForm(Object removeBulkForm) {
            this.removeBulkForm = removeBulkForm;
        }

        public Object getModifyBulkForm() {
            return modifyBulkForm;
        }

        public void setModifyBulkForm(Object modifyBulkForm) {
            this.modifyBulkForm = modifyBulkForm;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public Boolean getAddSupported() {
            return addSupported;
        }

        public void setAddSupported(Boolean addSupported) {
            this.addSupported = addSupported;
        }

        public Boolean getModifySupported() {
            return modifySupported;
        }

        public void setModifySupported(Boolean modifySupported) {
            this.modifySupported = modifySupported;
        }

        public Boolean getRemoveSupported() {
            return removeSupported;
        }

        public void setRemoveSupported(Boolean removeSupported) {
            this.removeSupported = removeSupported;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Rule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(((this.id == null) ? "<null>" : this.id));
            sb.append(',');
            sb.append("clientId");
            sb.append('=');
            sb.append(((this.clientId == null) ? "<null>" : this.clientId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null) ? "<null>" : this.name));
            sb.append(',');
            sb.append("priority");
            sb.append('=');
            sb.append(((this.priority == null) ? "<null>" : this.priority));
            sb.append(',');
            sb.append("expression");
            sb.append('=');
            sb.append(((this.expression == null) ? "<null>" : this.expression));
            sb.append(',');
            sb.append("executionRulesId");
            sb.append('=');
            sb.append(((this.executionRulesId == null) ? "<null>" : this.executionRulesId));
            sb.append(',');
            sb.append("addForm");
            sb.append('=');
            sb.append(((this.addForm == null) ? "<null>" : this.addForm));
            sb.append(',');
            sb.append("removeForm");
            sb.append('=');
            sb.append(((this.removeForm == null) ? "<null>" : this.removeForm));
            sb.append(',');
            sb.append("modifyForm");
            sb.append('=');
            sb.append(((this.modifyForm == null) ? "<null>" : this.modifyForm));
            sb.append(',');
            sb.append("addBulkForm");
            sb.append('=');
            sb.append(((this.addBulkForm == null) ? "<null>" : this.addBulkForm));
            sb.append(',');
            sb.append("removeBulkForm");
            sb.append('=');
            sb.append(((this.removeBulkForm == null) ? "<null>" : this.removeBulkForm));
            sb.append(',');
            sb.append("modifyBulkForm");
            sb.append('=');
            sb.append(((this.modifyBulkForm == null) ? "<null>" : this.modifyBulkForm));
            sb.append(',');
            sb.append("mode");
            sb.append('=');
            sb.append(((this.mode == null) ? "<null>" : this.mode));
            sb.append(',');
            sb.append("addSupported");
            sb.append('=');
            sb.append(((this.addSupported == null) ? "<null>" : this.addSupported));
            sb.append(',');
            sb.append("modifySupported");
            sb.append('=');
            sb.append(((this.modifySupported == null) ? "<null>" : this.modifySupported));
            sb.append(',');
            sb.append("removeSupported");
            sb.append('=');
            sb.append(((this.removeSupported == null) ? "<null>" : this.removeSupported));
            sb.append(',');
            if (sb.charAt((sb.length() - 1)) == ',') {
                sb.setCharAt((sb.length() - 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }
}
