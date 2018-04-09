package com.cloud.manila.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RsStoragePool implements Serializable{

    public static final long serialVersionUID=1L;

    private String host;

    private String name;

    private String pool;

    private String backend;

    @JsonProperty("capabilities")
    private RsCapabilities capabilities;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public RsCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(RsCapabilities capabilities) {
        this.capabilities = capabilities;
    }
}
