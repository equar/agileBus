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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Amenity")
public class Amenity implements Serializable {

	private static final long serialVersionUID = 1L;
	private int ameintyId;
	private String amenityName;
	private Set<Bus> bus = new HashSet<>();

	@Id
	@Column(name = "busId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAmeintyId() {
		return ameintyId;
	}

	public void setAmeintyId(int ameintyId) {
		this.ameintyId = ameintyId;
	}

	@Column(name = "amenityName", nullable = false, unique = true)
	public String getAmenityName() {
		return amenityName;
	}

	public void setAmenityName(String amenityName) {
		this.amenityName = amenityName;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "amenity")
	public Set<Bus> getBus() {
		return bus;
	}

	public void setBus(Set<Bus> bus) {
		this.bus = bus;
	}

}
