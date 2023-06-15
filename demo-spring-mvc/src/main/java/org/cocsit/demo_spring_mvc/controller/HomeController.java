package org.cocsit.demo_spring_mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping("/HelloData")
	public ModelAndView getData() 
	{
		String msg="welcome to cocsit";
		ModelAndView mv = new ModelAndView("firstpage","myMessage",msg);
		return mv;
	}
}
