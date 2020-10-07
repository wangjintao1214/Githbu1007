package com.kgc.springssm.pojo;

import java.util.Date;

public class Assets {
    private Integer d;

    private String assetid;

    private String assetname;

    private String assettype;

    private String  intodate;

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public String getAssetid() {
        return assetid;
    }

    public void setAssetid(String assetid) {
        this.assetid = assetid == null ? null : assetid.trim();
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public String getIntodate() {
        return intodate;
    }

    public void setIntodate(String intodate) {
        this.intodate = intodate;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "d=" + d +
                ", assetid='" + assetid + '\'' +
                ", assetname='" + assetname + '\'' +
                ", assettype='" + assettype + '\'' +
                ", intodate=" + intodate +
                '}';
    }
}