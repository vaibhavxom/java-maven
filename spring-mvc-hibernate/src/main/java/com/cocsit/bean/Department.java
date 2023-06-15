package com.cocsit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
	
	@Id
	private int deptNO;
	@Column(length=30)
	private String dname;
	@Column(length = 30)
	private String lco;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptNO, String dname, String lco) {
		super();
		this.deptNO = deptNO;
		this.dname = dname;
		this.lco = lco;
	}
	public int getDeptNO() {
		return deptNO;
	}
	public void setDeptNO(int deptNO) {
		this.deptNO = deptNO;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLco() {
		return lco;
	}
	public void setLco(String lco) {
		this.lco = lco;
	}
	@Override
	public String toString() {
		return "Department [deptNO=" + deptNO + ", dname=" + dname + ", lco=" + lco + "]";
	}
	
	
}
