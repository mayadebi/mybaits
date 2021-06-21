package com.fzy.dao;

import com.fzy.entity.SysUser;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SysUserDaoTest {
    @Test
    public void test() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        SysUserMapper mapper = sqlsession.getMapper(SysUserMapper.class);
        delUser(mapper);
        // 关闭
        sqlsession.close();
    }
    @Test
    public void testLog4j(){
        Logger logger = LogManager.getLogger(SysUser.class);
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
    }

    // 分页查询
    public void selectByLimit(SysUserMapper mapper) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("limit",0);
        map.put("size",5);
        List<SysUser> userByLimit = mapper.getUserByLimit(map);
        for (SysUser sysUser : userByLimit) {
            System.out.println(sysUser.toString());
        }
    }
    // 根据ID查询
    public void selectById(SysUserMapper mapper) {
        Map<String,Object> map = new HashMap<String,Object>();
        SysUser admin = mapper.getUserById(1, "fzy");
        System.out.println(admin.toString());
    }

    // 新增
    public void addUser(SysUserMapper mapper) {
        SysUser user = new SysUser();
        user.setName("test");;
        user.setPassword("aaaaa");
        int i = mapper.addUser(user);
        System.out.println(i);
    }

    // 修改
    public void uptUser(SysUserMapper mapper) {
        SysUser user = new SysUser();
        user.setPkid(5);
        user.setName("test");;
        user.setPassword("aaaaa");
        int i = mapper.uptUser(user);
        System.out.println(i);
    }

    // 修改
    public void delUser(SysUserMapper mapper) {
        int i = mapper.delUser(5);
        System.out.println(i);
    }
}
