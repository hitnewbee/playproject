package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReShareFolder implements Serializable{

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
}
