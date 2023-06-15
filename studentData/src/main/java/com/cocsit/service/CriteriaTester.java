package com.cocsit.service;

import java.util.List;

import org.cocsit.dao.StudentCriteria;
import com.cocsit.bean.Student;

public class CriteriaTester {
	
	
	public static void main(String[] args) {
		
		StudentCriteria dao = new StudentCriteria();
		
		List<Student> result = dao.getStudents();
		
		System.out.println("=========================================================================================================");
		
		System.out.println("print all student Records");
		for(Student s:result)
		{
			System.out.println(s);
		}
			
	}

}
