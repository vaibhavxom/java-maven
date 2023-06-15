package com.cocsit.bean;

public class Account {
	
	private String accountId;
	private String accountType;
	private String balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accountId, String accountType, String balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance + "]";
	}

}
