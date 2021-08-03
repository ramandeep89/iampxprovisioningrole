package in.seasec.rs.provisioningroleportal.jsonobjects;

public class NewTargetPermissionRequest {
    private Integer connectorId;
    private String name;
    private String type;
    private String modType;
    private String tag;
    private Integer executionPlanId;

    public Integer getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModType() {
        return modType;
    }

    public void setModType(String modType) {
        this.modType = modType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getExecutionPlanId() {
        return executionPlanId;
    }

    public void setExecutionPlanId(Integer executionPlanId) {
        this.executionPlanId = executionPlanId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NewTargetPermissionRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connectorId");
        sb.append('=');
        sb.append(((this.connectorId == null) ? "<null>" : this.connectorId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("modType");
        sb.append('=');
        sb.append(((this.modType == null) ? "<null>" : this.modType));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null) ? "<null>" : this.tag));
        sb.append(',');
        sb.append("executionPlanId");
        sb.append('=');
        sb.append(((this.executionPlanId == null) ? "<null>" : this.executionPlanId));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
