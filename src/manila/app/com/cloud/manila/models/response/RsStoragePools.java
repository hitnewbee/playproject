package com.cloud.manila.models.response;

import java.io.Serializable;
import java.util.List;

public class RsStoragePools implements Serializable{

    public static final long serialVersionUID=1L;

    private List<RsStoragePool> pools;

    public List<RsStoragePool> getPools() {
        return pools;
    }

    public void setPools(List<RsStoragePool> pools) {
        this.pools = pools;
    }
}
