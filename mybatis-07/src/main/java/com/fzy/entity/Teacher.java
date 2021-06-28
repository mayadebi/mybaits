package com.fzy.entity;

import java.util.List;

public class Teacher {
    private int pkid;
    private String name;
    private List<Student> student;

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

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "pkid=" + pkid +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public Teacher(int pkid, String name, List<Student> student) {
        this.pkid = pkid;
        this.name = name;
        this.student = student;
    }

    public Teacher() {
    }
}
