package com.fzy.entity;

public class Student {
    private int pkid;
    private String name;
    private Teacher teacher;


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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(int pkid, String name, Teacher teacher) {
        this.pkid = pkid;
        this.name = name;
        this.teacher = teacher;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "pkid=" + pkid +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
