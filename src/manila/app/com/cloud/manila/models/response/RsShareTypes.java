package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RsShareTypes implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("volume_type")
    private RsShareType volumeType;

    @JsonProperty("share_type")
    private RsShareType shareType;

    public RsShareType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(RsShareType volumeType) {
        this.volumeType = volumeType;
    }

    public RsShareType getShareType() {
        return shareType;
    }

    public void setShareType(RsShareType shareType) {
        this.shareType = shareType;
    }
}
