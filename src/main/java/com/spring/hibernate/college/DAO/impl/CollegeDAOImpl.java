package com.spring.hibernate.college.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.spring.hibernate.college.DAO.CollegeDAO;
import com.spring.hibernate.college.pojo.College;

@Repository
public class CollegeDAOImpl implements CollegeDAO {

	private Session session;
	private Transaction transaction;

	public CollegeDAOImpl() {
		super();
	}

	/*
	 * public CollegeDAOImpl(SessionFactory sessionFactory) { super();
	 * this.sessionFactory = sessionFactory; }
	 */

	@Autowired
	private SessionFactory sessionFactory;

	public String addStudentDeatils(College college) {

		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		System.out.println(transaction);
		session.save(college);
		transaction.commit();
		session.close();
		return "sucessfully inserted...!!!!!!!";
	}

	private Session getSession() {

		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
		return session;
	}

	public String updateStudentDeatils(College college) {

		String response = null;
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}

		if (college.getStudentId() > 0) {
			College col = session.get(College.class, college.getStudentId());

			if (!StringUtils.isEmpty(col)) {
				if (!StringUtils.isEmpty(college.getStudentName())) {
					col.setStudentName(college.getStudentName());
				}
				if (!StringUtils.isEmpty(college.getStudentField())) {
					col.setStudentField(college.getStudentField());
				}
				if (!StringUtils.isEmpty(college.getStudentCourse())) {
					col.setStudentCourse(college.getStudentCourse());
				}
				if (!StringUtils.isEmpty(college.getStudentAddress())) {
					col.setStudentAddress(college.getStudentAddress());
				}
				try {
					session.update(col);
					transaction.commit();
					response = "Successfully updated....!!!!!";
				} catch (Exception exception) {
					response = "Exception occurs";
					exception.printStackTrace();
				} finally {
					session.close();
				}
			}
		} else {
			response = "No data exists for given Id";
		}
		return response;
	}

	public List<College> getStudentDeatils(College college) {
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		return (List<College>) session.createCriteria(College.class).list();
	}

	@Override
	public String deleteStudentDeatils(int roll_no) {
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		College college = (College) session.get(College.class, roll_no);
		System.out.println(college);
		session.delete(college);
		transaction.commit();
		session.close();
		System.out.println("Successfully deleted ID......!!!!!!!!!!");
		return "Successfully deleted ID......!!!!!!!!!!";
	}

}
