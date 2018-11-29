package com.hfut.uml.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hfut.uml.dao.StudentMapper;
import com.hfut.uml.domain.FeedBack;
import com.hfut.uml.domain.FeedbackToTeac;
import com.hfut.uml.domain.Student;

@Service
@Scope("singleton")
public class StudentService {
	@Resource
	private StudentMapper studentMapper;
	
	/*学生发送反馈*/
	public void sendFeedback(FeedBack feedBack) {
		studentMapper.sendToTeacher(feedBack);
	}
	
	/*获取选课老师*/
	public List<FeedbackToTeac>getFeedbackToTeac(String sno){
		List<FeedbackToTeac>feedbackToTeacs=studentMapper.teacherNum(sno);
		if(feedbackToTeacs==null){
			System.out.println("feedbackToTeacs为空");
		}
		return feedbackToTeacs;
	}
	/*由学生编号返回反馈内容*/
	public List<FeedBack> queryFeedback(String sno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("sno", sno);
		List<FeedBack> list=studentMapper.queryAll(map);
		System.out.println("sno "+sno);
		if(list==null){
			System.out.println("kong1");
		}
		System.out.println(list.toString());
		return list;
	}
	
	/*学生信息*/
	public Student queryStudent(String sno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("sno", sno);
		return studentMapper.queryStu(map);
	}
	
	/*修改密码*/
	public void changePasswd(String sno,String newPwd) {
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("sno", sno);
		map.put("password", newPwd);
		studentMapper.changePwd(map);
	}
}
