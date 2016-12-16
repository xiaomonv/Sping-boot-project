package com.spring.hibernate.college.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College {

	@Id
	@Column(name = "roll_no", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	@Column(name = "student_name", nullable = false)
	private String studentName;
	@Column(name = "student_field", nullable = true)
	private String studentField;
	@Column(name = "student_course", nullable = false)
	private String studentCourse;
	@Column(name = "student_address", nullable = false)
	private String studentAddress;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentField() {
		return studentField;
	}

	public void setStudentField(String studentField) {
		this.studentField = studentField;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

}
