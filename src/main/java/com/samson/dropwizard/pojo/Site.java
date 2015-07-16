package com.samson.dropwizard.pojo;

import java.io.Serializable;

/**
 * Created by lixiaopeng on 2015/7/9.
 */
public class Site implements Serializable{

    private static final long serialVersionUID = -1404700126006229763L;

    private long id;
    private String netSite;
    private String createTime;

    public Site() {
        super();
    }

    public Site(long id, String netSite, String createTime) {
        this.id = id;
        this.netSite = netSite;
        this.createTime = createTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNetSite() {
        return netSite;
    }

    public void setNetSite(String netSite) {
        this.netSite = netSite;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
