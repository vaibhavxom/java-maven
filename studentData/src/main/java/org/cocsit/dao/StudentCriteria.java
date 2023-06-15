package org.cocsit.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cocsit.bean.Student;

public class StudentCriteria {
	
	SessionFactory sf;

	public StudentCriteria() {
		super();
	Configuration cfg = new Configuration().configure("myconfig.cfg.xml");
	
	sf=cfg.buildSessionFactory();
	}
	
	public List<Student> getStudents() {
		
		Session s =sf.openSession();
		CriteriaBuilder cb = s.getCriteriaBuilder();
		
		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		Root<Student> r = cq.from(Student.class);
	
		cq.select(r);
		TypedQuery<Student> quary = s.createQuery(cq);
		
		return quary.getResultList();
	} 
	

	 
	

}
