package com.zm.core.features;

public class Counter {
	
	private int val;
	private int interval;
	
	public Counter() {
		this.val = 0;
		this.interval = 1;
	}
	
	public void resetCounter() { 
		val = 0;
		interval = 1;
	}
	
	public int getNextCounter() { 
		val+=interval;
		return val ; 
	}
	
	public void setCounter(int i) { 
		val = i ; 
	}
	
	public void setInterval(int i) {
		interval = i;
	}
}
