package com.hfut.uml.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import com.hfut.uml.dao.FeedbackMapper;
import com.hfut.uml.domain.FeedBack;
	
@Service
@Scope("singleton")
public class LookupService {

	@Resource
	private FeedbackMapper fm ;
	
	public List<FeedBack> lookup(String tno) {
		// TODO Auto-generated method stub
		return (List) fm.lookup(tno);
	}

	public FeedBack more(int fid) {
		// TODO Auto-generated method stub
		return fm.more(fid);
	}

	public void insertans(FeedBack fb) {
		// TODO Auto-generated method stub
		fm.insertans(fb);
		return ;
	}

}
