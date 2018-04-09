package com.cloud.manila.models.response;

import java.io.Serializable;

public class RsSingleShareFolder implements Serializable{

    public static final long serialVersionUID=1L;

    private RsShareFolders share;

    public RsShareFolders getShare() {
        return share;
    }

    public void setShare(RsShareFolders share) {
        this.share = share;
    }
}
