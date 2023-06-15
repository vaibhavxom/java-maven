package com.cocsit.bean;

public class Customer {
	
	private String Id;
	private String name;
	private Account account;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer(String id, String name, Account account) {
		super();
		Id = id;
		this.name = name;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", account=" + account + "]";
	}
	

}
