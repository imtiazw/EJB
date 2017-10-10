package com.airline.services;

import javax.ejb.Local;

@Local
public interface FlightLocal{

	public Integer getFlightNumber();
	public void setFlightNumber(Integer flightNumber);
	public String getTo();
	public void setTo(String to);
	public String getFrom();
	public void setFrom(String from);
	public Integer getPassengers();
	public void setPassengers(Integer passengers);
	public Integer getPrice();
	public void setPrice(Integer price);
	public String getPlane();
	public void setPlane(String plane);
	@Override
	public String toString();
}
