package com.cocsit.service;

import org.hibernate.Session;	
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cocsit.bean.Department;

public class DepartmentAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf =cfg.buildSessionFactory();
		
		Session s =sf.openSession();
		
		Transaction ts = s.beginTransaction();
		Department d1 = new Department(70,"Sales&Servicec","Latur");
		
		s.save(d1);
		ts.commit();
		
		s.close();
	}

}
