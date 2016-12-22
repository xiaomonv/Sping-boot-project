package com.spring.hibernate.college.service;

import java.util.List;

import com.spring.hibernate.college.pojo.College;

public interface CollegeService{

	public String addStudentDeatils(College college);
	
	public String updateStudentDeatils(College college);
	
	public List<College> getStudentDeatils(College college);
	
	public String deleteStudentDeatils(int roll_no);
}
