package com.cocsit.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class UserMain {

	public static void main(String[] args) {
		
		Resource resource = new FileSystemResource("src/main/resources/beans.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		HelloWorld HW= beanFactory.getBean(HelloWorld.class);
		
		HW.display();
	}

}
