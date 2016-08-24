package com.agilebus.model;

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
@Table(name = "Ticket")
public class Ticket {
	private int ticketId;
	private int ticketNumber;
	private Date bookedDate;
	private Passenger passenger;
	private String ticketType;

	@Id
	@Column(name = "ticketId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	@Column(name = "ticketNumber", nullable = false, unique = true)
	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@Column(name = "bookedDate", nullable = false)
	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passengerId", nullable = false)
	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Transient
	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

}
