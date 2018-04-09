package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RsCapabilities implements Serializable{

    public static final long serialVersionUID=1L;

    private boolean qos;

    @JsonProperty("pool-name")
    private String poolName;

    private boolean compression;

    @JsonProperty("provisioned_capacity_gb")
    private int provisionedCapacityGb;

    @JsonProperty("allocated_capacity_gb")
    private int allocatedCapacityGb;

    @JsonProperty("driver_version")
    private String driverVersion;

    @JsonProperty("snapshot_support")
    private boolean snapshotSupport;

    private String timestamp;

    @JsonProperty("share_backend_name")
    private String shareBackendName;

    @JsonProperty("total_capacity_gb")
    private int totalCapacityGb;

    @JsonProperty("driver_handles_share_servers")
    private boolean driverHandlesShareServers;

    @JsonProperty("consistency_group_support")
    private boolean consistencyGroupSupport;

    private String pools;

    @JsonProperty("vendor_name")
    private String vendorName;

    @JsonProperty("reserved_percentage")
    private int reservedPercentage;

    @JsonProperty("free_capacity_gb")
    private int freeCapacityGb;

    @JsonProperty("storage_protocol")
    private String storageProtocol;

    private boolean dedupe;

    @JsonProperty("replication_domain")
    private String replicationDomain;

    @JsonProperty("pool_type")
    private String poolType;

    public boolean isQos() {
        return qos;
    }

    public void setQos(boolean qos) {
        this.qos = qos;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public boolean isCompression() {
        return compression;
    }

    public void setCompression(boolean compression) {
        this.compression = compression;
    }

    public int getProvisionedCapacityGb() {
        return provisionedCapacityGb;
    }

    public void setProvisionedCapacityGb(int provisionedCapacityGb) {
        this.provisionedCapacityGb = provisionedCapacityGb;
    }

    public int getAllocatedCapacityGb() {
        return allocatedCapacityGb;
    }

    public void setAllocatedCapacityGb(int allocatedCapacityGb) {
        this.allocatedCapacityGb = allocatedCapacityGb;
    }

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public boolean isSnapshotSupport() {
        return snapshotSupport;
    }

    public void setSnapshotSupport(boolean snapshotSupport) {
        this.snapshotSupport = snapshotSupport;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getShareBackendName() {
        return shareBackendName;
    }

    public void setShareBackendName(String shareBackendName) {
        this.shareBackendName = shareBackendName;
    }

    public int getTotalCapacityGb() {
        return totalCapacityGb;
    }

    public void setTotalCapacityGb(int totalCapacityGb) {
        this.totalCapacityGb = totalCapacityGb;
    }

    public boolean isDriverHandlesShareServers() {
        return driverHandlesShareServers;
    }

    public void setDriverHandlesShareServers(boolean driverHandlesShareServers) {
        this.driverHandlesShareServers = driverHandlesShareServers;
    }

    public boolean isConsistencyGroupSupport() {
        return consistencyGroupSupport;
    }

    public void setConsistencyGroupSupport(boolean consistencyGroupSupport) {
        this.consistencyGroupSupport = consistencyGroupSupport;
    }

    public String getPools() {
        return pools;
    }

    public void setPools(String pools) {
        this.pools = pools;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getReservedPercentage() {
        return reservedPercentage;
    }

    public void setReservedPercentage(int reservedPercentage) {
        this.reservedPercentage = reservedPercentage;
    }

    public int getFreeCapacityGb() {
        return freeCapacityGb;
    }

    public void setFreeCapacityGb(int freeCapacityGb) {
        this.freeCapacityGb = freeCapacityGb;
    }

    public String getStorageProtocol() {
        return storageProtocol;
    }

    public void setStorageProtocol(String storageProtocol) {
        this.storageProtocol = storageProtocol;
    }

    public boolean isDedupe() {
        return dedupe;
    }

    public void setDedupe(boolean dedupe) {
        this.dedupe = dedupe;
    }

    public String getReplicationDomain() {
        return replicationDomain;
    }

    public void setReplicationDomain(String replicationDomain) {
        this.replicationDomain = replicationDomain;
    }

    public String getPoolType() {
        return poolType;
    }

    public void setPoolType(String poolType) {
        this.poolType = poolType;
    }
}
