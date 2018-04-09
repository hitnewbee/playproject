package com.cloud.manila.models.request;

import java.io.Serializable;

public class ReShareFolders implements Serializable{

    public static final long serialVersionUID=1L;

    private ReShareFolder share;

    public ReShareFolder getShare() {
        return share;
    }

    public void setShare(ReShareFolder share) {
        this.share = share;
    }
}
