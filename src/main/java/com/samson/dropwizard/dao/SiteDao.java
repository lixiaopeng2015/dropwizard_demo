package com.samson.dropwizard.dao;

import com.samson.dropwizard.mapper.SiteMapper;
import com.samson.dropwizard.pojo.Site;
import com.samson.dropwizard.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by lixiaopeng on 2015/7/15.
 */
public class SiteDao {
    private static final Logger logger = LoggerFactory.getLogger(SiteDao.class);

    public static List<Site> getSites(){
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        if (sqlSession == null) {
            logger.error("request mybatis SqlSession exception....");
        }
        List<Site> list = null;
        try {
            SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
            list = siteMapper.getNetSites();

        } catch (Exception e) {
            logger.error("SiteDao class getSites method exception,get net site list failure...");
        }finally {
            sqlSession.close();
        }

        return list;
    }
}
