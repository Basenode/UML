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
import com.hfut.uml.filter.AdminLoginFilter;
import com.hfut.uml.service.AdminLoginService;

@Controller
public class adminLoginController {
	
	@Resource
	private AdminLoginService adminSvc;

	@RequestMapping(value="/adminLogin", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute(AdminLoginFilter.ATTR_ADMINUSER);
		return "redirect:../index_admin";
	}
	
	@RequestMapping(value="/adminLogin", method=RequestMethod.POST)
	private String login(@Valid @ModelAttribute("admin")UserLG user,
			Errors errors, HttpSession session) {
		if (errors.hasFieldErrors()){	
			return "index_admin";
		}
		
		try {
			Admin a = new Admin();
			a = adminSvc.CheckAdmin(user);
			if(a == null){
				errors.reject("LoginFail", "登录失败!");
				return "index_admin";
			}
			session.setAttribute("admin", a);
	        return "admin/index";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index_admin";
	}
}