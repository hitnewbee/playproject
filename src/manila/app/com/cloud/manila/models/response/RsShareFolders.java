package com.cloud.manila.models.response;

import java.io.Serializable;
import java.util.List;

public class RsShareFolders implements Serializable{

    public static final long serialVersionUID=1L;

    private List<RsShareFolder> share;

    public List<RsShareFolder> getShare() {
        return share;
    }

    public void setShare(List<RsShareFolder> share) {
        this.share = share;
    }
}
