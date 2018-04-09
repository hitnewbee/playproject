package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReExtendSize implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("new_size")
    private Integer newSize;

    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }
}
