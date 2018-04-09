package com.cloud.manila.models.response;

import java.io.Serializable;

public class RsCreateAuths implements Serializable{

    public static final long serialVersionUID=1L;

    private RsCreateAccess access;

    public RsCreateAccess getAccess() {
        return access;
    }

    public void setAccess(RsCreateAccess access) {
        this.access = access;
    }
}
