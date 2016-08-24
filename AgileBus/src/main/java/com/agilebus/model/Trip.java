package com.agilebus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Trip")
public class Trip implements Serializable {

	private static final long serialVersionUID = 1L;
	private int tripId;
	private Date departureTime;
	private Date departureDate;
	private Date arrivalTIme;
	private Date arrivalDate;
	private Date returnDate;
	private Location location;

	@Id
	@Column(name = "tripId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	@Column(name = "departureTime", nullable = false, unique = true)
	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	@Column(name = "departureDate", nullable = false, unique = true)
	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	@Column(name = "arrivalTIme", nullable = false, unique = true)
	public Date getArrivalTIme() {
		return arrivalTIme;
	}

	public void setArrivalTIme(Date arrivalTIme) {
		this.arrivalTIme = arrivalTIme;
	}

	@Column(name = "arrivalDate", nullable = false, unique = true)
	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locationId", nullable = false)
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Transient
	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
