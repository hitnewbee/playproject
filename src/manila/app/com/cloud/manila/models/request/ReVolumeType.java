package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReVolumeType implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("volume_type")
    private ReShareType volumeType;

    public ReShareType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(ReShareType volumeType) {
        this.volumeType = volumeType;
    }
}
