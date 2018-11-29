package com.hfut.uml.dao;

import java.util.List;
import java.util.Map;

import com.hfut.uml.domain.Colteacherinfo;
import com.hfut.uml.domain.Outteacherinfo;
import com.hfut.uml.domain.Schteacherinfo;

public interface TeacherMapper {
	public List<Schteacherinfo> getSchteacherinfo() ;
	public void passSchteacherinfo(Map<String, Object>map);
	public void delSchteacherinfo(Map<String, Object>map);
	
	public List<Outteacherinfo> getOutteacherinfo() ;
	public void delOutteacherinfo(Map<String, Object>map);
	public void passOutteacherinfo(Map<String, Object>map);
	
	public List<Colteacherinfo> getColteacherinfo() ;
	public void delColteacherinfo(Map<String, Object>map);
	public void passColteacherinfo(Map<String, Object>map);
}
