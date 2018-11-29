package com.hfut.uml.controller;

import javax.annotation.Resource;
import javax.servlet.http.*;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hfut.uml.domain.*;
import com.hfut.uml.filter.UserLoginFilter;
import com.hfut.uml.service.UserLoginService;

@Controller
public class UserLoginController {
	
	@Resource
	private UserLoginService userSvc;

	@RequestMapping(value="/UserLogin", method=RequestMethod.POST)
	private String login(@Valid @ModelAttribute("user")UserLG user,
			Errors errors, HttpSession session, HttpServletRequest request) {
		if (errors.hasFieldErrors()){	
			return "index";
		}
		
		try {
			if(request.getParameter("status").equals("student")){
				Student u = new Student();
				u = userSvc.CheckStudent(user);
				if(u == null){
					errors.reject("LoginFail", "登录失败!");
					return "index";
				}
				session.setAttribute("StudentNo", u.getSno());
		        return "Student/index";
			}else if (request.getParameter("status").equals("instructor")) {
				Instructor i = new Instructor();
				i = userSvc.CheckInstructor(user);
				if(i == null){
					errors.reject("LoginFail", "登录失败!");
					return "index";
				}
				session.setAttribute("counno", i.getCounno());
		        return "Instructor/index";
			}else if (request.getParameter("status").equals("teacher")){
				Teacher t = new Teacher();
				t = userSvc.CheckTeacher(user);
				if(t == null){
					errors.reject("LoginFail", "登录失败!");
					return "index";
				}
				session.setAttribute("tno", t.getTno());
		        return "Teacher/ShowInfo";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
}