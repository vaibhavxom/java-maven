package com.beans.employee;

public class Employee {
	
	private String empName;
	private String empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	public void display() 
	{
		System.out.println("emp id :"+empId);
		System.out.println("emp name :"+empName);
	}

}
