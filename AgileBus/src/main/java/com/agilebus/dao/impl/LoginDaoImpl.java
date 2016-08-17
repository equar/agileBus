package com.agilebus.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.agilebus.dao.LoginDao;
import com.agilebus.model.LoginBean;
import com.agilebus.model.RoleBean;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public boolean isValidUser(LoginBean loginBean) {
		/*
		 * String query =
		 * "Select count(1) from users where username = ? and password = ?";
		 * PreparedStatement pstmt =
		 * dataSource.getConnection().prepareStatement(query);
		 * pstmt.setString(1, loginBean.getUsername()); pstmt.setString(2,
		 * loginBean.getPassword()); ResultSet resultSet = pstmt.executeQuery();
		 * if (resultSet.next()) { return (resultSet.getInt(1) > 0); } else {
		 * return false; }
		 */

		return true;
	}

	@Override
	public boolean addUserRole(RoleBean roleBean) {
		/*
		 * String query = "Insert into user_role(role_type) values(?)";
		 * PreparedStatement pstmt =
		 * dataSource.getConnection().prepareStatement(query);
		 * pstmt.setString(1, roleBean.getRoleType()); int resultSet =
		 * pstmt.executeUpdate(); if (resultSet > 0) { return true; } else {
		 * return false; }
		 */
		Session session = sessionFactory.openSession();
		/* Session session = this.sessionFactory.getCurrentSession(); */
		session.persist(roleBean);

		return true;
	}

}