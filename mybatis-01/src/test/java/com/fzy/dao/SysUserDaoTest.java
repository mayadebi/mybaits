package com.fzy.dao;

import com.fzy.entity.SysUser;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SysUserDaoTest {
    @Test
    public void test(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        SysUserDao mapper = sqlsession.getMapper(SysUserDao.class);
        List<SysUser> userListAll = mapper.getUserListAll();
        for (SysUser sysUser : userListAll) {
            System.out.println(sysUser.toString());
        }
        // 关闭
        sqlsession.close();
    }
}
