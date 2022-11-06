package com.quiz.model;

public class StudentModel {
	
	private int rollno;
	private String firstName;
	private String lastName;
	private String password;
	private int score;
	private boolean examstatus;
	public StudentModel(int rollno, String firstName, String lastName, String password, int score, boolean examstatus) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.score = score;
		this.examstatus = examstatus;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isExamstatus() {
		return examstatus;
	}
	public void setExamstatus(boolean examstatus) {
		this.examstatus = examstatus;
	}
	@Override
	public String toString() {
		return "StudentModel [rollno=" + rollno + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", score=" + score + ", examstatus=" + examstatus + "]";
	}
	
	

}
