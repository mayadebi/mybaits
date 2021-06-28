package com.fzy.entity;

public class Teacher {
    private int pkid;
    private String name;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "pkid=" + pkid +
                ", name='" + name + '\'' +
                '}';
    }

    public Teacher(int pkid, String name) {
        this.pkid = pkid;
        this.name = name;
    }

    public Teacher() {
    }
}
