package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RsShareFolder implements Serializable{

    public static final long serialVersionUID=1L;

    private String name;

    private String description;

    @JsonProperty("share_proto")
    private String shareProto;

    @JsonProperty("share_network_id")
    private String shareNetworkId;

    @JsonProperty("is_public")
    private boolean isPublic;

    private int size;

    @JsonProperty("availability_zone")
    private String availabilityZone;

    @JsonProperty("snapshot_id")
    private String snapshotId;

    @JsonProperty("consistency_group_id")
    private String consistencyGroupId;

    @JsonProperty("share_type")
    private String shareType;

    @JsonProperty("export_location")
    private String exportLocation;

    @JsonProperty("share_type_name")
    private String shareTypeName;

    @JsonProperty("project_id")
    private String projectId;

    private String status;

    @JsonProperty("access_rules_status")
    private String accessRulesStatus;

    @JsonProperty("volume_type")
    private String volumeType;

    private String host;

    private Map<String,String> metadate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShareProto() {
        return shareProto;
    }

    public void setShareProto(String shareProto) {
        this.shareProto = shareProto;
    }

    public String getShareNetworkId() {
        return shareNetworkId;
    }

    public void setShareNetworkId(String shareNetworkId) {
        this.shareNetworkId = shareNetworkId;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getConsistencyGroupId() {
        return consistencyGroupId;
    }

    public void setConsistencyGroupId(String consistencyGroupId) {
        this.consistencyGroupId = consistencyGroupId;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getExportLocation() {
        return exportLocation;
    }

    public void setExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
    }

    public String getShareTypeName() {
        return shareTypeName;
    }

    public void setShareTypeName(String shareTypeName) {
        this.shareTypeName = shareTypeName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccessRulesStatus() {
        return accessRulesStatus;
    }

    public void setAccessRulesStatus(String accessRulesStatus) {
        this.accessRulesStatus = accessRulesStatus;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Map<String, String> getMetadate() {
        return metadate;
    }

    public void setMetadate(Map<String, String> metadate) {
        this.metadate = metadate;
    }
}
