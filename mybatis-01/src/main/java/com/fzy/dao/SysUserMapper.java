package com.fzy.dao;

import com.fzy.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {
    // 查询全部用户
    List<SysUser> getUserListAll();

    // 格局ID查询用户
    SysUser getUserById(int id);

    // 插入用户
    int addUser(SysUser sysUser);

    // 修改
    int updateUser(SysUser sysUser);

    // 删除
    int delUser(int id);

    // 多个参数用map,或者实体类
    int addUser2(Map<String,Object> map);

    // 模糊查询
    List<SysUser> getUserLike(String name);

}
