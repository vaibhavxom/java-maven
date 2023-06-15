package com.demo.services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.demo.bean.Manager;

@SuppressWarnings("deprecation")
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res  =new FileSystemResource("src/main/resources/beans.xml");
		
		BeanFactory bf = new XmlBeanFactory(res);
		
		Manager mn = (Manager)bf.getBean("managerbean");
		
		System.out.println(mn);

	}

}
