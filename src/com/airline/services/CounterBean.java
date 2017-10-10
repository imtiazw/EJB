package com.airline.services;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class CounterBean
 */
@Singleton
@LocalBean
public class CounterBean {

	private int counter = 0;
    /**
     * Default constructor. 
     */
    public CounterBean() {
        // TODO Auto-generated constructor stub
    }
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
    
    public void addCounter() {
    	this.counter++;
    }

}
