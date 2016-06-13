package com.henry.entity;

public class Score {
    private Integer sId;

    private Integer score;

    private String subject;

    private Student student;

    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Score(){};

	public Score(Integer sId, Integer score, String subject, Student student) {
		super();
		this.sId = sId;
		this.score = score;
		this.subject = subject;
		this.student = student;
	}

	public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }
}