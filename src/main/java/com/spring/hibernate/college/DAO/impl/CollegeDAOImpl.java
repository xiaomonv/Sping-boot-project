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

	/*public CollegeDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}*/

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
		
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		session.update(college);
		transaction.commit();
		return "Successfully updated...!!!!";
	}

	public List<College> getStudentDeatils(College college) {
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		return (List<College>) session.createCriteria(College.class).list();
	}

}
