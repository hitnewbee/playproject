package com.cloud.manila.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

public class ReShareType implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("os-share-type-access:is_public")
    private boolean accessIsPublic;

    @JsonProperty("extra_specs")
    private Map<String ,String >extraSpec;

    private String name;

    public boolean isAccessIsPublic() {
        return accessIsPublic;
    }

    public void setAccessIsPublic(boolean accessIsPublic) {
        this.accessIsPublic = accessIsPublic;
    }

    public Map<String, String> getExtraSpec() {
        return extraSpec;
    }

    public void setExtraSpec(Map<String, String> extraSpec) {
        this.extraSpec = extraSpec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
