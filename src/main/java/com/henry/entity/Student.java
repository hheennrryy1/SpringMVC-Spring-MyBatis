package com.henry.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
    private Integer id;

    private String name;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    
    public Student(){};
    
    public Student(Integer id, String name, Date birthday) {
    	this.id = id;
    	this.name = name;
    	this.birthday = birthday;
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
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}