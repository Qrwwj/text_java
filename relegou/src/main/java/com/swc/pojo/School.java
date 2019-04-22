package com.swc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller("sch")
public class School {
    @Value(value = "1")
    private Integer id;
    @Value(value = "xuexiao")
    private String name;
    @Autowired
    private Student stu;

    public School() {
    }

    public School(Integer id, String name, Student stu) {
        this.id = id;
        this.name = name;
        this.stu = stu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }
}
