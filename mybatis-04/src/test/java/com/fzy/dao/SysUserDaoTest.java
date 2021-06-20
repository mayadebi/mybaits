package com.fzy.dao;

import com.fzy.entity.SysUser;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


public class SysUserDaoTest {
    @Test
    public void test() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        SysUserMapper mapper = sqlsession.getMapper(SysUserMapper.class);
        selectById(mapper);
        // 关闭
        sqlsession.close();
    }
    @Test
    public void testLog4j(){
        Logger logger = LogManager.getLogger("Log");
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
    }

    // 根据ID查询
    public void selectById(SysUserMapper mapper) {
        SysUser userById = mapper.getUserById(1);
        System.out.println(userById.toString());
    }


}
