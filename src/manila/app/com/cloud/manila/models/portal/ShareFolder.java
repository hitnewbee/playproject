package com.cloud.manila.models.portal;

import java.io.Serializable;
import java.util.List;

public class ShareFolder implements Serializable{

    private static final long serialVersionUID = 1L;

    private String zone;

    private String zoneName;

    private String uuid;

    private String shareFolderName;

    private String description;

    private String folderSize;

    private String protocol;

    private String status;

    private String storagePoolName;

    private String accessRulesStatus;

    private List<String> exportLocations;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getShareFolderName() {
        return shareFolderName;
    }

    public void setShareFolderName(String shareFolderName) {
        this.shareFolderName = shareFolderName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFolderSize() {
        return folderSize;
    }

    public void setFolderSize(String folderSize) {
        this.folderSize = folderSize;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStoragePoolName() {
        return storagePoolName;
    }

    public void setStoragePoolName(String storagePoolName) {
        this.storagePoolName = storagePoolName;
    }

    public String getAccessRulesStatus() {
        return accessRulesStatus;
    }

    public void setAccessRulesStatus(String accessRulesStatus) {
        this.accessRulesStatus = accessRulesStatus;
    }

    public List<String> getExportLocations() {
        return exportLocations;
    }

    public void setExportLocations(List<String> exportLocations) {
        this.exportLocations = exportLocations;
    }
}
