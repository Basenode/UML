package com.hfut.uml.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hfut.uml.dao.InstructorCheckEvaluateMapper;
import com.hfut.uml.domain.FeedBack;

@Service
@Scope("singleton")
public class InstructorCheckEvaluateServ {
	@Resource
    private InstructorCheckEvaluateMapper iCheckMapper;
	
	public List<FeedBack> getAllFeedback(){
		return iCheckMapper.getAllFeedbacks();
	}
	public void passFeedbacks(int fid,int checkbycounsellor){
		Map<String, Object>map = new HashMap<String, Object>();
		map.put("fid", fid);
		map.put("checkbycounsellor",checkbycounsellor);
		iCheckMapper.passFeedback(map);
	}
}
