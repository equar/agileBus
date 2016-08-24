package com.agilebus.form;

import com.agilebus.model.Location;
import com.agilebus.model.Trip;

public class BusSearch {
	private final Location location;
	private final Trip trip;

	public BusSearch() {
		this.location = new Location();
		this.trip = new Trip();
	}

	public BusSearch(Location location, Trip trip) {
		this.location = location;
		this.trip = trip;
	}

	public Location getLocation() {
		return location;
	}

	public Trip getTrip() {
		return trip;
	}

}
