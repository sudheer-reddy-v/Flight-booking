package com.flight.booking.pojo;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class FlightSearch {
	
	private String source;
	private String destination;
	private String date;
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
		
	

}
