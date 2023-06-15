package com.cocsit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cocsit.bean.Department;
import com.cocsit.dao.DepartmentDao;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentDao dao;
	@RequestMapping ("InsertDepartment")
	public ModelAndView preInsert()
	{
		Department department=new Department();
		department.setDeptNO(dao.getDepartmentId());
		ModelAndView mv=new ModelAndView("InsertDepartment","department",department);
		return mv;
		}
	@RequestMapping("InsertDepartment")
		public ModelAndView insertDepartment(@ModelAttribute("department") Department dept)
		{
			ModelAndView mv=new ModelAndView("reslut","department",dept);
			if(dao.insertDepartment(dept))
			{
				mv.addObject("msg","Department Inserted Successfully");
			}
			else
			{
				mv.addObject("msg","Error! Failed to insert Department.");
			}
			return mv;
		}
	
}
