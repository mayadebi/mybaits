package com.fzy.dao;

import com.fzy.entity.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {

    // 格局ID查询用户
    @Select("SELECT * FROM sys_user where pkid = #{id} and name = #{name}")
    SysUser getUserById(@Param("id") int id,@Param("name") String name);
//     使用注解不能用resultMap  要用sql里面as  或者用xml 不推荐
    @Select("SELECT * FROM sys_user limit #{limit},#{size}")
    List<SysUser> getUserByLimit(Map<String,Object> map);

    @Insert("insert into sys_user value(DEFAULT,#{name},#{password})")
    int addUser(SysUser user);

    @Update(("update sys_user set name = #{name},password = ${password} where pkid = #{pkid}"))
    int uptUser(SysUser user);

    @Delete("delete from sys_user where pkid = #{pkid}")
    int delUser(int pkid);
}
