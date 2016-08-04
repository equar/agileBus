package com.agilebus.delegate;

import java.sql.SQLException;

import com.agilebus.model.BusBean;
import com.agilebus.service.BusService;

public class BusDelegate {
	private BusService busService;

	public BusService getBusService() {
		return busService;
	}

	public void setBusService(BusService busService) {
		this.busService = busService;
	}

	public boolean isValidUser(BusBean busBean) throws SQLException {
		return busService.isValidUser(busBean);
	}

}
