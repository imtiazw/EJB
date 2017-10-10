package com.airline.services;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class FlightService
 */
@Stateful(name = "flightStateful")
public class FlightServiceStateful implements FlightLocal{

    /**
     * Default constructor. 
     */
    public FlightServiceStateful() {
        // TODO Auto-generated constructor stub
    }
    private Integer flightNumber = 1234;
    private String to = "los angeles";
    private String from = "new york";
    private Integer passengers = 250;
    private Integer price = 400;
    private String plane = "boieng 787";
    
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Integer getPassengers() {
		return passengers;
	}
	public void setPassengers(Integer passengers) {
		this.passengers = passengers;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPlane() {
		return plane;
	}
	public void setPlane(String plane) {
		this.plane = plane;
	}
	@Override
	public String toString() {
		return "FlightService [flightNumber=" + flightNumber + ", to=" + to + ", from=" + from + ", passengers="
				+ passengers + ", price=" + price + ", plane=" + plane + "]";
	}
    
    

}
