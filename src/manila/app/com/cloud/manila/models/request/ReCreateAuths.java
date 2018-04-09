package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReCreateAuths implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("os-allow_access")
    private ReCreateAuth osAllowAccess;

    public ReCreateAuth getOsAllowAccess() {
        return osAllowAccess;
    }

    public void setOsAllowAccess(ReCreateAuth osAllowAccess) {
        this.osAllowAccess = osAllowAccess;
    }
}
