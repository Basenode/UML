package com.hfut.uml.dao;

import java.util.List;

import com.hfut.uml.domain.FeedBack;

public interface FeedbackMapper {

	public List<FeedBack> lookup(String tno) ;

	public FeedBack more(int fid);

	public void insertans(FeedBack fb);

}
