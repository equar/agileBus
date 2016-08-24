package com.agilebus.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bus")
public class Bus implements Serializable {

	private static final long serialVersionUID = 1L;
	private int busId;
	private String plateNumber;
	private BusLevel busLevel;
	private String model;
	private Company company;
	private Set<Amenity> amenity = new HashSet<>();
	private Set<Passenger> passengers = new HashSet<>();

	@Id
	@Column(name = "busId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	@Column(name = "plateNumber", nullable = false, unique = true)
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "levelId", nullable = false)
	public BusLevel getBusLevel() {
		return busLevel;
	}

	public void setBusLevel(BusLevel busLevel) {
		this.busLevel = busLevel;
	}

	@Column(name = "model")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companyId", nullable = false)
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "BusAmenity", joinColumns = {
			@JoinColumn(name = "busId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ameintyId", nullable = false, updatable = false) })
	public Set<Amenity> getAmenity() {
		return amenity;
	}

	public void setAmenity(Set<Amenity> amenity) {
		this.amenity = amenity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bus")
	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

}
