package com.airline.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CounterBean
 */
@Stateful
@LocalBean
public class CounterStatefulBean {

	private int counter = 0;
    /**
     * Default constructor. 
     */
    public CounterStatefulBean() {
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
