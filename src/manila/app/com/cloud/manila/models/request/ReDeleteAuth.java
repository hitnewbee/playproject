package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReDeleteAuth implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("access_id")
    private String accessId;

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }
}
