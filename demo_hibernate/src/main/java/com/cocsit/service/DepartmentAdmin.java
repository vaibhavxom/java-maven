package com.cocsit.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cocsit.bean.Department;
import com.cocsit.dao.DepartmentDao;

public class DepartmentAdmin {
	
	public static void main(String[] args) {
//		Configuration cfg = new Configuration().configure();
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session s = sf.openSession();
//		Transaction ts = s.beginTransaction();
//		Department d1 = new Department(80,"Services","Pune");
//		s.save(d1);
//		ts.commit();
//		s.close();
		
	DepartmentDao dao = new DepartmentDao();
	//Department dept = new Department(85,"computerSci","Latur");
	
	//System.out.println(dao.insertDept(dept));
	//System.out.println(dao.deleteDept(85));

	Department dept = dao.getDept(10);
System.out.println(dept.getDeptno());	
System.out.println(dept.getDeptName());
System.out.println(dept.getDeptLocation());
	
	
		
		
	}

}
