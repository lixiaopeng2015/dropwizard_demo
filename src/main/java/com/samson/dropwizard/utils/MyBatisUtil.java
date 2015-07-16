package com.samson.dropwizard.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by lixiaopeng on 2015/7/9.
 */
public class MyBatisUtil {
    private static Logger logger = LoggerFactory.getLogger(MyBatisUtil.class);

    private static SqlSessionFactory sqlSessionFactory;
    private static final String RESOURCE = "mybatis-config.xml";

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(RESOURCE);
        } catch (IOException e) {
            logger.error("load " + RESOURCE + " failure....");
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }


    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
