package com.agilebus.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Passenger")
public class Passenger {
	private int passengerId;
	private String name;
	private String emailId;
	private String gender;
	private int age;
	private String phoneNumber;
	private TicketAgent ticketAgent;
	private Bus bus;
	private Set<Ticket> ticket = new HashSet<>();

	@Id
	@Column(name = "passengerId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	@Column(name = "name", nullable = false, unique = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "emailId", unique = true)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agentId", nullable = false)
	public TicketAgent getTicketAgent() {
		return ticketAgent;
	}

	public void setTicketAgent(TicketAgent ticketAgent) {
		this.ticketAgent = ticketAgent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "busId", nullable = false)
	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passenger")
	public Set<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(Set<Ticket> ticket) {
		this.ticket = ticket;
	}

}
