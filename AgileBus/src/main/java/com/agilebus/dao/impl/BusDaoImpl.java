package com.agilebus.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.agilebus.dao.BusDao;
import com.agilebus.model.Bus;

public class BusDaoImpl implements BusDao {

	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public boolean isValidUser(Bus bus) {
		/*
		 * String query =
		 * "Select count(1) from users where username = ? and password = ?";
		 * PreparedStatement pstmt =
		 * dataSource.getConnection().prepareStatement(query);
		 * pstmt.setString(1, busBean.getFrom()); pstmt.setString(2,
		 * busBean.getTo()); ResultSet resultSet = pstmt.executeQuery(); if
		 * (resultSet.next()) return (resultSet.getInt(1) > 0); else return
		 * false;
		 */
		return false;
	}

}
