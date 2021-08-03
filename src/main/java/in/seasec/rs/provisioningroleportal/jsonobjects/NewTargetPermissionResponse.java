package in.seasec.rs.provisioningroleportal.jsonobjects;

import java.util.List;

public class NewTargetPermissionResponse {
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
        sb.append(NewTargetPermissionResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("backendUniqueName");
        sb.append('=');
        sb.append(((this.backendUniqueName == null)?"<null>":this.backendUniqueName));
        sb.append(',');
        sb.append("connectorId");
        sb.append('=');
        sb.append(((this.connectorId == null)?"<null>":this.connectorId));
        sb.append(',');
        sb.append("modType");
        sb.append('=');
        sb.append(((this.modType == null)?"<null>":this.modType));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("executionPlanId");
        sb.append('=');
        sb.append(((this.executionPlanId == null)?"<null>":this.executionPlanId));
        sb.append(',');
        sb.append("bulkExecutionPlanId");
        sb.append('=');
        sb.append(((this.bulkExecutionPlanId == null)?"<null>":this.bulkExecutionPlanId));
        sb.append(',');
        sb.append("supportedActions");
        sb.append('=');
        sb.append(((this.supportedActions == null)?"<null>":this.supportedActions));
        sb.append(',');
        sb.append("complianceTargetPermissions");
        sb.append('=');
        sb.append(((this.complianceTargetPermissions == null)?"<null>":this.complianceTargetPermissions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
