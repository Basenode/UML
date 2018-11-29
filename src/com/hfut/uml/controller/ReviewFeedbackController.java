package com.hfut.uml.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hfut.uml.domain.FeedBack;
import com.hfut.uml.service.ReviewFeedbackService;

@Controller
@RequestMapping(value="/admin")
public class ReviewFeedbackController {
	
	@Resource
	private ReviewFeedbackService rfbservice;
	/*管理员查看评价*/
	@RequestMapping(value="/ReviewFeedback",method=RequestMethod.GET)
	public String ReviewFeedback(Model model, HttpSession session){
		List<FeedBack> list=rfbservice.getAllFeedback();
		model.addAttribute("feedBacks", list);
		return "admin/ReviewFeedback";
	}
	
	/*@RequestMapping(value="/submitFeedback",method=RequestMethod.GET)
	public String submitFeedback(Model model, HttpSession session, String page,String pass){
		System.out.println(pass);
		String []temp;
		String isPass=null,outtno=null;
		if(pass!=null){
			temp=pass.split(";");
			isPass=temp[0];
			outtno=temp[1].split("=")[1];
			System.out.println("isPass"+isPass+"outtno "+outtno);
		}
		rfbservice.passFeedbacks(Integer.parseInt(outtno), Integer.parseInt(isPass));
		return ReviewFeedback(model, session, page);
	}*/
	
	@RequestMapping(value="/submitFeedback",method=RequestMethod.GET)
	public String submitFeedback(Model model,HttpSession session,Integer pass,Integer intno){
		rfbservice.passFeedbacks(Integer.valueOf(intno), Integer.valueOf(pass));
		return ReviewFeedback(model, session);
	}
	
	/*@RequestMapping(value="/submitFeedback",method=RequestMethod.GET)
	public String submitEvaluate(Model model,HttpSession session,Integer chuanpass,Integer chuanfid){
		IS.passFeedbacks(Integer.valueOf(chuanfid),Integer.valueOf(chuanpass));
		return ReviewFeedback(session,model);
	}*/
}
