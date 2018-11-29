package com.hfut.uml.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hfut.uml.domain.*;
import com.hfut.uml.service.StudentService;

@Controller
@RequestMapping(value="/Student")
public class StudentController {
	@Resource
	private StudentService studentService;
	
	/*学生提交反馈*/
	@RequestMapping(value="/SubmitFeedback",method=RequestMethod.GET)
	public String SubmitFeedback(Model model, HttpSession session, String page,
			@ModelAttribute("feedBack")FeedBack feedBack,HttpServletRequest request){
		List<FeedbackToTeac>feedbackToTeacs=studentService.getFeedbackToTeac((String)session.getAttribute("StudentNo"));
		model.addAttribute("feedbackToTeacs", feedbackToTeacs);
		feedBack.setTno(request.getParameter("chooseTeacher"));
		feedBack.setSno((String)session.getAttribute("StudentNo"));
		if(request.getParameter("chooseTeacher")!=null)
			studentService.sendFeedback(feedBack);
		return "Student/StudentEvaluate";
	}
	
	
	/*初始化反馈*/
	@RequestMapping(value="/initFeedback",method=RequestMethod.GET)
	public String initFeedback(Model model, HttpSession session, String page){
		List<FeedbackToTeac>feedbackToTeacs=studentService.getFeedbackToTeac((String)session.getAttribute("StudentNo"));
		model.addAttribute("feedbackToTeacs", feedbackToTeacs);
		return "Student/StudentEvaluate";
	}
	
	/*学生查看反馈*/
	@RequestMapping(value="/checkFeedback",method=RequestMethod.GET)
	public String checkFeedback(Model model, HttpSession session, String page){
		List<FeedBack> feedbacks=studentService.queryFeedback((String)session.getAttribute("StudentNo"));
		if(feedbacks!=null){
			for (FeedBack feedBack : feedbacks) {
				System.out.println(feedBack.getFcontent());
			}
		}
		model.addAttribute("teaFeedback",feedbacks);
		return "Student/CheckReview";
	}
	
	/*学生修改密码*/
	@RequestMapping(value="/changePasswd",method=RequestMethod.POST)
	public String changePasswd(Model model, HttpSession session, String page,String password){
		System.out.println(password);
		Student student=studentService.queryStudent((String)session.getAttribute("StudentNo"));
		String pastPasswd=student.getPassword();
		System.out.println("pastPasswd:"+pastPasswd);
		System.out.println("sno"+student.getSno());
		model.addAttribute("pastPasswd", pastPasswd);
		studentService.changePasswd((String)session.getAttribute("StudentNo"), password);
		
		return 	"Student/PWChange";
	}
	
	
	
}
