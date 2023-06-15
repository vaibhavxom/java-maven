package com.cocsit.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cocsit.bean.Department;

@Repository
@Transactional
public class DepartmentDao {

	@Autowired
		SessionFactory sessionFactory;
	
	HibernateTemplate hibernateTemplate;
	public int getDepartmentId()
	{
		int id=0;
		Session session=sessionFactory.openSession();
		TypedQuery<Department> query=session.createQuery("select max (d.detno) from Department d");
		List list=query.getResultList();
		if(list!=null && list.size()>0)
			{
			Object b=list.get(0);
			if(b!=null)
			{
				id=(Integer)b;
			}
				
		}
		session.close();
		return id+10;
	}
	public boolean insertDepartment(Department department)
	{
		hibernateTemplate.persist(department);
		return true;
	}
	
}
