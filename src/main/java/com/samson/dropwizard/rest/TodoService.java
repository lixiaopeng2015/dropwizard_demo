package com.samson.dropwizard.rest;

import com.alibaba.fastjson.JSON;
import com.codahale.metrics.annotation.Timed;
import com.samson.dropwizard.dao.SiteDao;
import com.samson.dropwizard.pojo.Site;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by lixiaopeng on 2015/7/9.
 */
@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoService {

    @GET
    @Path("/Sites")
    @Timed
    public String getSites(){
        List<Site> list = SiteDao.getSites();
        return JSON.toJSONString(list);
    }
}
