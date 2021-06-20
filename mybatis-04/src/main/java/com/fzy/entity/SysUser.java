package com.fzy.entity;

import org.apache.ibatis.type.Alias;

// 使用注解起别名   否则使用默认别名
@Alias("sysUser")
public class SysUser {
    private int pkid;
    private String name;
    private String psw;

    public int getPkid() {
        return pkid;
    }

    public void setPkid(int pkid) {
        this.pkid = pkid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "pkid=" + pkid +
                ", name='" + name + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }

    public SysUser() {
    }

    public SysUser(int pkid, String name, String psw) {
        this.pkid = pkid;
        this.name = name;
        this.psw = psw;
    }
}
