package com.cocsit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_tb")

public class Student {
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="studentId")
	private int studentID ;
	@Column(name="StudentName", length=20,nullable = false)
	private String StudentName;
	private String course;
	
	public Student(int studentID, String studentName, String course) {
		super();
		this.studentID = studentID;
		StudentName = studentName;
		this.course = course;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", StudentName=" + StudentName + ", course=" + course
				+ ", getStudentID()=" + getStudentID() + ", getStudentName()=" + getStudentName() + ", getCourse()="
				+ getCourse() + "]";
	}
	

}
