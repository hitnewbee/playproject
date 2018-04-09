package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReCreateAuth implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("access_level")
    private  String accessLevel;

    @JsonProperty("access_type")
    private String accessType;

    @JsonProperty("access_to")
    private String accessTo;

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getAccessTo() {
        return accessTo;
    }

    public void setAccessTo(String accessTo) {
        this.accessTo = accessTo;
    }
}
