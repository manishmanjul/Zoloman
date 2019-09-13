package com.zm.core.features;

public interface Producer <T>{

	public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	public static final String numbers = "0123456789";
	public static final int GENERATE_NUMERIC = 1;
	public static final int GENERATE_ALPHA = 0;	
	
	T produce();
}
