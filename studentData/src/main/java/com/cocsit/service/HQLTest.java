package com.cocsit.service;

import java.util.List;

import org.cocsit.dao.StudentDao;

import com.cocsit.bean.Student;

public class HQLTest {

	public static void main(String[] args) {
		
		 
		StudentDao dao = new StudentDao();
		List<Student> result = dao.getStudents();
		
		System.out.println("student Records");
		
		for(Student s:result)
		{
			System.out.println(s);
		}
		
		System.out.println("==============================================================================================================");
		
		List<Student> result1 = dao.getStudentsByCourse("Bca");
		System.out.println("BCA Student Records");
		
		for(Student s:result1)
		{
			System.out.println(s);
		}
		
		System.out.println("=============================================================================================================");
		
		List<Student> result2 = dao.getStudentsTop3();
		
		System.out.println("top three students");
		
		for(Student s:result2)
		{
			System.out.println(s);
		}
		System.out.println("=============================================================================================================");
		
		
	}

}
