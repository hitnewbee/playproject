package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;

public class RsShareType implements Serializable{

    public static final long serialVersionUID=1L;

    @JsonProperty("os-share-type-access:is_public")
    private boolean accessIsPublic;

    @JsonProperty("required_extra_specs")
    private Map<String ,String>requiredExtraSpecs;

    @JsonProperty("extra_specs")
    private Map<String,String> extraSpecs;

    private String id;

    private String name;

    public boolean isAccessIsPublic() {
        return accessIsPublic;
    }

    public void setAccessIsPublic(boolean accessIsPublic) {
        this.accessIsPublic = accessIsPublic;
    }

    public Map<String, String> getRequiredExtraSpecs() {
        return requiredExtraSpecs;
    }

    public void setRequiredExtraSpecs(Map<String, String> requiredExtraSpecs) {
        this.requiredExtraSpecs = requiredExtraSpecs;
    }

    public Map<String, String> getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
