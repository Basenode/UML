package com.hfut.uml.dao;

import java.util.List;
import java.util.Map;

import com.hfut.uml.domain.FeedBack;

public interface ReviewFeedbackMapper {
	public List<FeedBack> getAllFeedbacks();
	public void passFeedback(Map<String, Object>map);
}
