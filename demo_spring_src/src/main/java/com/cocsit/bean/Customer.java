package com.cocsit.bean;

public class Customer {
	private String custId;
	private String custName;
	private Account account;
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer(String custId, String custName, Account account) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.account = account;
	}

	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", account=" + account + "]";
	}
	
}
