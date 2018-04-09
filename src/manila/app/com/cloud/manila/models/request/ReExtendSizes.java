package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReExtendSizes implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("os-extend")
    private ReExtendSize extend;

    public ReExtendSize getExtend() {
        return extend;
    }

    public void setExtend(ReExtendSize extend) {
        this.extend = extend;
    }
}
