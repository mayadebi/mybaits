package com.fzy.dao;

import com.fzy.entity.SysUser;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysUserDaoTest {
    @Test
    public void test() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        SysUserMapper mapper = sqlsession.getMapper(SysUserMapper.class);
        Map<String, Object> map = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        map.put("ids",integers);
        List<SysUser> sysUserAll = mapper.getSysUserAll3(map);
        for (SysUser sysUser : sysUserAll) {
            System.out.println(sysUser.toString());
        }
        // 关闭
        uptSysuser(mapper);
        sqlsession.close();
    }

    public void uptSysuser(SysUserMapper mapper) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "aaaa");
        map.put("password", "1");
        map.put("pkid", "1");
        int i = mapper.uptSysUser(map);
        System.out.println();
    }
}
