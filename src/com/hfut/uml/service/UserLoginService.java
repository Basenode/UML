package com.hfut.uml.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hfut.uml.dao.UserLoginMapper;
import com.hfut.uml.domain.*;

@Service
@Scope("singleton")
public class UserLoginService {
	@Resource
    private UserLoginMapper UM;
	
	public Student CheckStudent(UserLG user){
		return UM.checkStudent(user);
	}

	public Teacher CheckTeacher(UserLG user) {
		return UM.checkTeacher(user);
	}

	public Instructor CheckInstructor(UserLG user) {
		return UM.checkInstructor(user);
	}

	
}