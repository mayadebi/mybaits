package com.fzy.dao;

import com.fzy.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {

    // 格局ID查询用户
    SysUser getUserById(int id);

    List<SysUser> getUserByLimit(Map<String,Object> map);
}
