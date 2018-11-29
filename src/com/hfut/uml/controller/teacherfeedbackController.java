package com.hfut.uml.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hfut.uml.domain.FeedBack;
import com.hfut.uml.service.LookupService;

@Controller
@RequestMapping(value="/Teacher")
public class teacherfeedbackController {

	@Resource
    private LookupService ls;
	
	@RequestMapping(value = "/lookup", method = RequestMethod.GET)
	public String lookup(HttpSession session ,Model model){
		String tno = (String)session.getAttribute("tno");
		List<FeedBack> list = null;
		list = ls.lookup(tno);
		for( int i = 0 ; i < list.size() ; i ++){
			if(list.get(i).getIsanyonymity() == 1){
				list.get(i).setSno("匿名同学");
			}
		}
		model.addAttribute("result", list);
		
		return "Teacher/ShowEvaluate";
	}
	
	@RequestMapping(value = "/moreInfo", method = RequestMethod.GET)
	public String moreInfo(int fid ,Model model){
		FeedBack fb = new FeedBack();
		fb = ls.more(fid) ;
		if(fb.getIsanyonymity() == 1){
			fb.setSno("匿名同学");
		}
		model.addAttribute("fb", fb);
		
		return "Teacher/FeedBack";
		
	}
	
	@RequestMapping(value = "/answer", method = RequestMethod.POST)
	public String answer(HttpServletRequest request , @ModelAttribute("fb")FeedBack fb, Model model){
		ls.insertans(fb);
		
		fb = ls.more(fb.getFid()) ;
		if(fb.getIsanyonymity() == 1){
			fb.setSno("匿名同学");
		}
		model.addAttribute("fb", fb);
		
		return "Teacher/ShowEvaluate";
	}
	
}
