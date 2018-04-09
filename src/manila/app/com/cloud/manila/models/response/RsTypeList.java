package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import java.io.Serializable;

public class RsTypeList implements Serializable {

    public static final long serialVersionUID=1L;

    @JsonProperty("volume_type")
    private List<RsShareType> volumeTypes;

    @JsonProperty("share_types")
    private List<RsShareType> shareTypes;

    public List<RsShareType> getVolumeTypes() {
        return volumeTypes;
    }

    public void setVolumeTypes(List<RsShareType> volumeTypes) {
        this.volumeTypes = volumeTypes;
    }

    public List<RsShareType> getShareTypes() {
        return shareTypes;
    }

    public void setShareTypes(List<RsShareType> shareTypes) {
        this.shareTypes = shareTypes;
    }
}
