package com.hfut.uml.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hfut.uml.domain.Colteacherinfo;
import com.hfut.uml.domain.Outteacherinfo;
import com.hfut.uml.domain.Schteacherinfo;
import com.hfut.uml.service.TeacherService;

@Controller
@RequestMapping(value="/admin")
public class TeacherController {
	@Resource
	private TeacherService teacherService;
	
		
	@RequestMapping(value="/submitSchteacherinfo",method=RequestMethod.GET)
	public String submitSchteacherinfo(Model model, HttpSession session, String page,String pass){
		System.out.println(pass);
		String []temp;
		String isPass=null,intno=null;
		if(pass!=null){
			temp=pass.split(";");
			isPass=temp[0];
			intno=temp[1].split("=")[1];
			System.out.println("isPass"+isPass+"intno "+intno);
		}
		
		List<Schteacherinfo> schteacherinfoList;
		schteacherinfoList=teacherService.getSchteacherinfos();
		if(schteacherinfoList!=null){
			for (Schteacherinfo schteacherinfo : schteacherinfoList) {
				System.out.println(schteacherinfo.getAge());
			}
		}
		else {
			System.out.println("schteacherinfoList为空");
		}
		if("0".equals(isPass)){
			System.out.println("不通过");
			teacherService.delSchteacherinfo(intno);
		}
		else if ("1".equals(isPass)) {
			System.out.println("通过");
			teacherService.passSchteacherinfo(intno);
		}
		model.addAttribute("schteacherinfoList", schteacherinfoList);
		return "admin/Review";
	}
	
	@RequestMapping(value="/submitOutteacherinfo",method=RequestMethod.GET)
	public String submitOutteacherinfo(Model model, HttpSession session, String page,String pass){
		String []temp;
		String isPass=null,outtno=null;
		if(pass!=null){
			temp=pass.split(";");
			isPass=temp[0];
			outtno=temp[1].split("=")[1];
			System.out.println("isPass"+isPass+"outtno "+outtno);
		}
		List<Outteacherinfo> outteacherinfoList;
		outteacherinfoList=teacherService.getOutteacherinfos();
		if("0".equals(isPass)){
			System.out.println("不通过");
			teacherService.delOutteacherinfo(outtno);;
		}
		else if ("1".equals(isPass)) {
			System.out.println("通过");
			teacherService.passOutteacherinfo(outtno);
		}
		model.addAttribute("outteacherinfoList", outteacherinfoList);
		return "admin/Review";
	}
	
	@RequestMapping(value="/submitColteacherinfo",method=RequestMethod.GET)
	public String submitColteacherinfo(Model model, HttpSession session, String page,String pass){
		String []temp;
		String isPass=null,coltno=null;
		if(pass!=null){
			temp=pass.split(";");
			isPass=temp[0];
			coltno=temp[1].split("=")[1];
			System.out.println("isPass"+isPass+"coltno "+coltno);
		}
		List<Colteacherinfo> colteacherinfoList;
		colteacherinfoList=teacherService.getColteacherinfos();
		if("0".equals(isPass)){
			System.out.println("不通过");
			teacherService.delColteacherinfo(coltno);;
		}
		else if ("1".equals(isPass)) {
			System.out.println("通过");
			teacherService.passColteacherinfo(coltno);
		}
		model.addAttribute("colteacherinfoList", colteacherinfoList);
		return "admin/Review";
	}
	
	
}
