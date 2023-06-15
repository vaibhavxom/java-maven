package com.cocsit.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cocsit.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration().configure("myconfig.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction ts =s.beginTransaction(); 
		
		Student stud =new Student(105,"Basu","Bca");
		s.save(stud);
		ts.commit();
		s.close();
		System.out.println("Record Inserted");

	}

}
