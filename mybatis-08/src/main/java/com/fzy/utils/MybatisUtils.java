package com.fzy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

// 工具类
public class MybatisUtils {
    public static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            // 获取SqlSessionFactory对象  工厂
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 自动提交
    public static SqlSession getSqlsession(){
        return sqlSessionFactory.openSession(true);
    }
}

