package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReDeleteAuths implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("os-deny_access")
    private ReDeleteAuth denyAccess;

    public ReDeleteAuth getDenyAccess() {
        return denyAccess;
    }

    public void setDenyAccess(ReDeleteAuth denyAccess) {
        this.denyAccess = denyAccess;
    }
}
