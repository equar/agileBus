package com.agilebus.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.agilebus.dao.BusDao;
import com.agilebus.model.Bus;
import com.agilebus.service.BusService;


public class BusServiceImpl implements BusService {

	private BusDao busDao;

	public void setBusDao(BusDao busDao) {
		this.busDao = busDao;
	}

	@Override
	@Transactional
	public boolean isValidUser(Bus bus) {
		return busDao.isValidUser(bus);
	}

}
