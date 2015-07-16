package com.samson.dropwizard.mapper;

import com.samson.dropwizard.pojo.Site;

import java.util.List;

/**
 * Created by lixiaopeng on 2015/7/9.
 */
public interface SiteMapper {
    List<Site> getNetSites();
}
