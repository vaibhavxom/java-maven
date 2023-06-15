package com.demo.bean;

public class Manager {
	
	private String managerId;
	private String managerName;
	private Department department;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String managerId, String managerName, Department department) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.department = department;
		
		System.out.println("Auto wired @constructor");
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
		System.out.println("auto wired @ setter");
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", department=" + department + "]";
	}
	
	

}
