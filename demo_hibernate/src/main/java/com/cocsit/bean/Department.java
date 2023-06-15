package com.cocsit.bean;

public class Department {
	private int deptno;
	private String deptName;
	private String deptLocation;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptno, String deptName, String deptLocation) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

}
