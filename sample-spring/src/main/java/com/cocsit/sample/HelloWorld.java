package com.cocsit.sample;

public class HelloWorld {
	
	private String msg;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void display() 
	{
		System.out.println("Hello "+msg+" "+name);
	}

}
