package com.fzy.dao;

import com.fzy.entity.SysUser;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysUserDaoTest {
    @Test
    public void test() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        SysUserMapper mapper = sqlsession.getMapper(SysUserMapper.class);
        like(mapper, sqlsession);
        // 关闭
        sqlsession.close();
    }

    //查询全部
    public void selectAll(SysUserMapper mapper) {
        List<SysUser> userListAll = mapper.getUserListAll();
        for (SysUser sysUser : userListAll) {
            System.out.println(sysUser.toString());
        }
    }

    // 根据ID查询
    public void selectById(SysUserMapper mapper) {
        SysUser userById = mapper.getUserById(1);
        System.out.println(userById.toString());
    }

    // 插入
    public void add(SysUserMapper mapper, SqlSession sqlsession) {
        SysUser admin = new SysUser(2, "admin", "123456");
        int i = mapper.addUser(admin);
        System.out.println(i);
        // 需要提交
        sqlsession.commit();
    }

    //修改
    public void update(SysUserMapper mapper, SqlSession sqlsession) {
        SysUser admin = new SysUser(2, "admin", "admin");
        int i = mapper.updateUser(admin);
        System.out.println(i);
        // 需要提交
        sqlsession.commit();
    }

    //删除
    public void dekete(SysUserMapper mapper, SqlSession sqlsession) {
        int i = mapper.delUser(2);
        System.out.println(i);
        // 需要提交
        sqlsession.commit();
    }

    //map传值
    public void add2(SysUserMapper mapper, SqlSession sqlsession) {
        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("pkid","2");
        map.put("name","admin");
        map.put("password","aaaaaa");
        int i = mapper.addUser2(map);
        System.out.println(i);
        // 需要提交
        sqlsession.commit();
    }

    // 模糊查询
    public void like(SysUserMapper mapper, SqlSession sqlsession){
        List<SysUser> a = mapper.getUserLike("a");
        for (SysUser sysUser : a) {
            System.out.println(a.toString());
        }
    }
}
