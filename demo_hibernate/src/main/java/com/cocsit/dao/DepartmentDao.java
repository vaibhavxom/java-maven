package com.cocsit.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cocsit.bean.Department;

public class DepartmentDao {

SessionFactory sf ;

public DepartmentDao() {
	super();
	Configuration cfg = new Configuration().configure();
	
	sf= cfg.buildSessionFactory();
}

public String insertDept (Department dept)
{
	Session s = sf.openSession();
	
	Transaction ts= s.beginTransaction();
	
	s.save(dept);
	ts.commit();
	s.close();
	return "Inserted successfully";
}

public String UpdateDep(Department dept) 
{
	Session s = sf.openSession();
	
	Transaction ts= s.beginTransaction();
	
	s.update(dept);
	ts.commit();
	s.close();
	
	
	return"updated successfully";
}

public String deleteDept(int deptNO) {
	
	Session s = sf.openSession();
	
	Transaction ts= s.beginTransaction();
	Department dept= new Department();
	dept.setDeptno(deptNO);
	s.delete(dept);
	ts.commit();
	s.close();
	return"Deleted successfully";
}

public Department getDept(int deptno) {
	
	Session s = sf.openSession();
	Department dept = new Department();
	
	dept = s.get(Department.class,deptno);
	s.close();
	
	
	
	return dept;
}		
		
		
		
		
		
		
		
		
		
}
