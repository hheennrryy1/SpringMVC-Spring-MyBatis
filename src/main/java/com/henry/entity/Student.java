package com.henry.entity;

import java.util.Date;
import java.util.List;

public class Student {
	
    private Integer id;

    private String name;

    public Student(Integer id, String name, Date birthday, List<Score> score) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.score = score;
	}

	private Date birthday;
    
    private List<Score> score;

    public List<Score> getscore() {
		return score;
	}

	public void setscore(List<Score> score) {
		this.score = score;
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