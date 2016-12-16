package com.spring.hibernate.college.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.college.DAO.CollegeDAO;
import com.spring.hibernate.college.pojo.College;
import com.spring.hibernate.college.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeDAO collegeDAO;

	public String addStudentDeatils(College college) {
		return collegeDAO.addStudentDeatils(college);
	}

	public String updateStudentDeatils(College college) {
		return collegeDAO.updateStudentDeatils(college);
	}

}
