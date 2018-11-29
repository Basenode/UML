package com.hfut.uml.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hfut.uml.dao.AdminLoginMapper;
import com.hfut.uml.domain.*;

@Service
@Scope("singleton")
public class AdminLoginService {
	@Resource
    private AdminLoginMapper AM;
	
	public Admin CheckAdmin(UserLG user) {
		return AM.checkAdmin(user);
	}
}