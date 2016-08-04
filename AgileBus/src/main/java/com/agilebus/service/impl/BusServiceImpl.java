package com.agilebus.service.impl;

import java.sql.SQLException;

import com.agilebus.dao.BusDao;
import com.agilebus.model.BusBean;
import com.agilebus.model.LoginBean;
import com.agilebus.service.BusService;

public class BusServiceImpl implements BusService {
	private BusDao busDao;

	public BusDao getBusDao() {
		return busDao;
	}

	public void setBusDao(BusDao busDao) {
		this.busDao = busDao;
	}

	@Override
	public boolean isValidUser(BusBean busBean) throws SQLException {
		return busDao.isValidUser(busBean);
	}

}
