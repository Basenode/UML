package com.hfut.uml.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hfut.uml.domain.FeedBack;
import com.hfut.uml.service.InstructorCheckEvaluateServ;

@Controller
@RequestMapping(value="/Instructor")
public class InstructorCheckEvaluateController {
	@Resource 
	private InstructorCheckEvaluateServ IS;
	
	@RequestMapping(value="/CheckEvaluate",method=RequestMethod.GET)
	public String CheckEvaluate(HttpSession session,Model model){
		List<FeedBack> fList = IS.getAllFeedback();
		model.addAttribute("feedBacks", fList);
		return "Instructor/CheckEvaluate";
	}
	
	@RequestMapping(value="/submitEvaluate",method=RequestMethod.GET)
	public String submitEvaluate(Model model,HttpSession session,Integer chuanpass,Integer chuanfid){
		IS.passFeedbacks(Integer.valueOf(chuanfid),Integer.valueOf(chuanpass));
		return CheckEvaluate(session,model);
	}
	
}
