package com.hfut.uml.dao;


import java.util.List;
import java.util.Map;

import com.hfut.uml.domain.FeedBack;
import com.hfut.uml.domain.FeedbackToTeac;
import com.hfut.uml.domain.Student;

public interface StudentMapper {
	public void sendToTeacher(FeedBack feedBack);
	public List<FeedBack> queryAll(Map<String, Object> map);
	public Student queryStu(Map<String, Object> map);
	public void changePwd(Map<String, Object> map) ;
	public List<FeedbackToTeac>teacherNum(String sno);
}
