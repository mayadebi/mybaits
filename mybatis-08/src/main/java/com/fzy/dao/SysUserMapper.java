package com.fzy.dao;

import com.fzy.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {
    List<SysUser> getSysUserAll(Map<String,Object> map);
    List<SysUser> getSysUserAll2(Map<String,Object> map);
    int uptSysUser(Map<String,Object> map);
    List<SysUser> getSysUserAll3(Map<String,Object> map);
}
