package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class RsAccessLists implements Serializable{

    public static final long serialVersionUID=1L;

    private String shareID;

    @JsonProperty("access_list")
    private List<RsAccessList> accessLists;

    public String getShareID() {
        return shareID;
    }

    public void setShareID(String shareID) {
        this.shareID = shareID;
    }

    public List<RsAccessList> getAccessLists() {
        return accessLists;
    }

    public void setAccessLists(List<RsAccessList> accessLists) {
        this.accessLists = accessLists;
    }
}
