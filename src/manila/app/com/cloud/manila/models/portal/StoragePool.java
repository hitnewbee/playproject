package com.cloud.manila.models.portal;

import com.sun.glass.ui.View;

import java.io.Serializable;
import java.util.Objects;

public class StoragePool implements Serializable{

    private String host;

    private String name;

    private String pool;

    private String backend;

    private Capabilities capabilities;

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

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

    @Override
    public boolean equals(Object o) {
        StoragePool storagePool =(StoragePool) o;
        if (storagePool.getBackend().equals(backend)){
            if (storagePool.getCapabilities().getPoolType().equals(capabilities.getPoolType())){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {

       int result =17;
       result = result*31+backend.hashCode();
       result = result*31+capabilities.getPoolType().hashCode();
       return result;
    }
}
