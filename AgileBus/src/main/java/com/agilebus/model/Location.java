package com.agilebus.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;
	private int locationId;
	private String fromLocation;
	private String toLocation;
	private Set<Trip> trip = new HashSet<>();

	@Id
	@Column(name = "locationId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Column(name = "fromLocation", nullable = false, unique = true)
	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	@Column(name = "toLocation", nullable = false, unique = true)
	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<Trip> getTrip() {
		return trip;
	}

	public void setTrip(Set<Trip> trip) {
		this.trip = trip;
	}

}
