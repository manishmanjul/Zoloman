package com.web.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
public class Alien {

	@Id
	private int aid;
	private String aName;
	private String aTech;
	
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
	public String getaTech() {
		return aTech;
	}
	public void setaTech(String sTech) {
		this.aTech = sTech;
	}	
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aName=" + aName + ", aTech=" + aTech + "]";
	}
	
}
