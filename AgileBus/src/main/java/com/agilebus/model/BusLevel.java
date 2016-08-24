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
@Table(name = "BusLevel")
public class BusLevel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int levelId;
	private String levelDescription;
	private Set<Bus> bus = new HashSet<>();

	@Id
	@Column(name = "levelId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	@Column(name = "levelDescription", nullable = false, unique = true)
	public String getLevelDescription() {
		return levelDescription;
	}

	public void setLevelDescription(String levelDescription) {
		this.levelDescription = levelDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "busLevel")
	public Set<Bus> getBus() {
		return bus;
	}

	public void setBus(Set<Bus> bus) {
		this.bus = bus;
	}

}
