package com.hfut.uml.dao;

import com.hfut.uml.domain.*;

public interface UserLoginMapper {

	public Student checkStudent(UserLG user);

	public Teacher checkTeacher(UserLG user);

	public Instructor checkInstructor(UserLG user);
	
	
}