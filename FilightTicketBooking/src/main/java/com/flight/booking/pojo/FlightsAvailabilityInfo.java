package com.flight.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHTSCHEDULE")
public class FlightsAvailabilityInfo {
	
	@Id
	@Column(name="flightId")
	private String flightId;
	@Column(name="flightName")
	private String flightName;
	@Embedded
	private FlightSearch travelDetails;
//	@Column(name="seatAvailablity")
//	private boolean seatAvailablity;
//	private String price;
	
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
//	public boolean isSeatAvailablity() {
//		return seatAvailablity;
//	}
//	public void setSeatAvailablity(boolean seatAvailablity) {
//		this.seatAvailablity = seatAvailablity;
//	}
//	public String getPrice() {
//		return price;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}
	
	

}
