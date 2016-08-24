package com.agilebus.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.agilebus.dao.LoginDao;
import com.agilebus.model.User;
import com.agilebus.model.UserRole;

public class LoginDaoImpl implements LoginDao {

	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public boolean isValidUser(User user) {

		return true;
	}

	@Override
	public boolean addUserRole(UserRole userRole) {

		Session session = sessionFactory.openSession();
		session.save(userRole);
		session.close();
		return true;
	}

	public boolean registerAccount(User user) {
		Session session = sessionFactory.openSession();
		session.save(user);
		session.close();
		return true;
	}

}