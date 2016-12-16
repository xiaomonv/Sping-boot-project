package com.spring.hibernate.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.college.pojo.College;
import com.spring.hibernate.college.service.CollegeService;

@RestController
public class Controller {

	@Autowired
	private CollegeService collegeService;
	
	@RequestMapping("/addStudentDetails")
	public String addStudentDeatils(){
		College college = new College();
		college.setStudentName("Aviral");
		college.setStudentCourse("B.Tech");
		college.setStudentField("CS");
		college.setStudentAddress("Shastri Nagar");
		return collegeService.addStudentDeatils(college);
		
		
	}
	
	@RequestMapping("/updateStudentDetails")
	public String updateStudentDeatils(){
		College college = new College();
		college.setStudentName("Aviral Mittal");
		college.setStudentCourse("B.Tech");
		college.setStudentField("CS");
		college.setStudentAddress("Shastri Nagar");
		return collegeService.updateStudentDeatils(college);
		
		
	}
}
