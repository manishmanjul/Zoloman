package com.first.boot;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int laptioId;
	private String brand;
	
	public int getLaptioId() {
		return laptioId;
	}
	public void setLaptioId(int laptioId) {
		this.laptioId = laptioId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Laptop [laptioId=" + laptioId + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("Compiling");
	}

}
