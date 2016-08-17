package com.agilebus.service.impl;

import org.springframework.stereotype.Service;

import com.agilebus.dao.BusDao;
import com.agilebus.model.BusBean;
import com.agilebus.service.BusService;

@Service("busService")
public class BusServiceImpl implements BusService {

	private BusDao busDao;

	public void setBusDao(BusDao busDao) {
		this.busDao = busDao;
	}

	@Override
	public boolean isValidUser(BusBean busBean) {
		return busDao.isValidUser(busBean);
	}

}
