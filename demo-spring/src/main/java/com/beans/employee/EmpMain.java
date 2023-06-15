package com.beans.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


@SuppressWarnings("deprecation")
public class EmpMain {

	public static void main(String[] args) {
		
		Resource resource = new FileSystemResource("src/main/resources/beans.xml");
		
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Employee emp= beanFactory.getBean(Employee.class);
		
		emp.display();

	}

}
