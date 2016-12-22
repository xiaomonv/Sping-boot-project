package com.spring.hibernate.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.hibernate.college.pojo.College;
import com.spring.hibernate.college.service.CollegeService;

@RestController
public class Controller {

	@Autowired
	private CollegeService collegeService;

	@RequestMapping(value = "/")
	public ModelAndView addDoctor() {
		return new ModelAndView("angular");
	}

	@RequestMapping("/addStudentDetails")
	public String addStudentDeatils() {
		College college = new College();
		college.setStudentName("Aviral");
		college.setStudentCourse("B.Tech");
		college.setStudentField("CS");
		college.setStudentAddress("Shastri Nagar");
		return collegeService.addStudentDeatils(college);
	}

	@RequestMapping("/updateStudentDetails")
	public String updateStudentDeatils() {
		College college = new College();
		college.setStudentId(6);
		college.setStudentName("Aviral");
		college.setStudentAddress("Shastri Nagar, Delhi");
		return collegeService.updateStudentDeatils(college);
	}

	@RequestMapping("/getStudentDetails")
	public List<College> getStudentDeatils() {
		College college = new College();
		college.getStudentId();
		return collegeService.getStudentDeatils(college);
	}
	
	@RequestMapping("/deleteStudentDetails")
	public String deleteStudentDeatils() {
		return collegeService.deleteStudentDeatils(5);
	}
	
	@RequestMapping(value = "/getMVCStudentDetails")
	public ModelAndView getDoctor(@RequestParam int id) {

		College college = new College();
		college.setStudentId(id);
		List<College> response = collegeService.getStudentDeatils(college);
		System.out.println(response);
		return new ModelAndView("angular", "collegeList", response);
	}
	
}
