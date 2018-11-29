package com.hfut.uml.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hfut.uml.dao.ReviewFeedbackMapper;
import com.hfut.uml.domain.FeedBack;

@Service
@Scope("singleton")
public class ReviewFeedbackService {
	@Resource
	private ReviewFeedbackMapper reviewFeedback;
	
	public List<FeedBack> getAllFeedback(){
		return reviewFeedback.getAllFeedbacks();
	}
	
	public void passFeedbacks(int Fid,int checkbyadmin){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("fid", Fid);
		map.put("checkbyadmin", checkbyadmin);
		reviewFeedback.passFeedback(map);
	}

	
}
