package com.cocsit.services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.cocsit.bean.Account;
import com.cocsit.bean.Customer;

public class UserMainAc {
	
	public static void main(String[] args) {
		
		Resource res = new FileSystemResource("src/main/resources/beans.xml");
		
		BeanFactory bf = new XmlBeanFactory(res);
		
		
		Customer cm = (Customer)bf.getBean("customerBean");
		//System.out.println(cus);
		
		System.out.println(cm);
	}

}
