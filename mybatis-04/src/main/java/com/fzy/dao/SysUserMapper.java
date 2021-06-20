package com.fzy.dao;

import com.fzy.entity.SysUser;

public interface SysUserMapper {

    // 格局ID查询用户
    SysUser getUserById(int id);

}
