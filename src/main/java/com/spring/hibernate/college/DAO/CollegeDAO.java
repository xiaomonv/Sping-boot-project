package com.spring.hibernate.college.DAO;

import java.util.List;

import com.spring.hibernate.college.pojo.College;

public interface CollegeDAO {

	String addStudentDeatils(College college);
	
	public String updateStudentDeatils(College college);
	
	public List<College> getStudentDeatils(College college);
	
	public String deleteStudentDeatils(int roll_no);
	
}
