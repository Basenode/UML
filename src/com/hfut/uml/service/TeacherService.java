package com.hfut.uml.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hfut.uml.dao.TeacherMapper;
import com.hfut.uml.domain.Colteacherinfo;
import com.hfut.uml.domain.Outteacherinfo;
import com.hfut.uml.domain.Schteacherinfo;

@Service
@Scope("singleton")
public class TeacherService {
	@Resource
	private TeacherMapper teacherMapper;
	
	public List<Schteacherinfo> getSchteacherinfos(){
		List<Schteacherinfo>list=new ArrayList<Schteacherinfo>();
		
		if(teacherMapper.getSchteacherinfo()!=null){
			list=teacherMapper.getSchteacherinfo();
		}
		else {
			System.out.println("teacherMapper.getSchteacherinfo(map)为空");
		}
		return list;
	}
	
	public List<Outteacherinfo> getOutteacherinfos(){
		List<Outteacherinfo>list=new ArrayList<Outteacherinfo>();
		
		if(teacherMapper.getOutteacherinfo()!=null){
			list=teacherMapper.getOutteacherinfo();
		}
		else {
			System.out.println("teacherMapper.getOutteacherinfo(map)为空");
		}
		return list;
	}
	
	public List<Colteacherinfo> getColteacherinfos(){
		List<Colteacherinfo>list=new ArrayList<Colteacherinfo>();
		
		if(teacherMapper.getColteacherinfo()!=null){
			list=teacherMapper.getColteacherinfo();
		}
		else {
			System.out.println("teacherMapper.getColteacherinfo(map)为空");
		}
		return list;
	}
	
	public void delSchteacherinfo(String intno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("intno", intno);
		teacherMapper.delSchteacherinfo(map);
	}
	
	public void delColteacherinfo(String colno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("coltno", colno);
		teacherMapper.delSchteacherinfo(map);
	}
	
	public void delOutteacherinfo(String outtno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("outtno", outtno);
		teacherMapper.delSchteacherinfo(map);
	}
	
	public void passSchteacherinfo(String intno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("intno", intno);
		teacherMapper.passSchteacherinfo(map);
	}
	
	public void passColteacherinfo(String coltno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("coltno", coltno);
		teacherMapper.passColteacherinfo(map);
	}
	
	public void passOutteacherinfo(String outtno){
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("outtno", outtno);
		teacherMapper.passOutteacherinfo(map);
	}
}
