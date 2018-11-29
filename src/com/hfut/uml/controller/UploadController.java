package com.hfut.uml.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.hfut.uml.util.Upload;


@Controller
//@RequestMapping(value="/Teacher")
public class UploadController {
	
	@RequestMapping(value="/ExcelUploadCtrl",method=RequestMethod.POST)
	public String excelUploadCtrl(Model model, HttpSession session, String page,MultipartFile excelFile){
		/*处理未选择文件情况*/
		if(excelFile==null){
			session.setAttribute("fileError", "请选择文件后操作！");
		}else {
			if(session.getAttribute("fileError")!=null){
				session.removeAttribute("fileError");
			}
		}
		try {
			Upload.readXls(excelFile.getInputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Upload";
	}
}
