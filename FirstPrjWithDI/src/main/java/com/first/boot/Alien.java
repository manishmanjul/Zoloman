package com.first.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	private int aid;
	private String aName;
	private String sTech;
	
	@Autowired
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("Alien Object created.");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getsTech() {
		return sTech;
	}
	public void setsTech(String sTech) {
		this.sTech = sTech;
	}	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("I am an Alien");
		laptop.compile();
	}
	
}
