package com.zm.core.features;

@FunctionalInterface
public interface Producer <T>{

	public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	public static final String numbers = "0123456789";
	public static final int GENERATE_NUMERIC = 1;
	public static final int GENERATE_ALPHA = 0;	
	public static final int PASSWORD_LENGTH = 8;
	public static final int ALPHABET_COUNT = 52;
	public static final int NUMERIC_COUNT = 10;
	public int COUNTER = 1;
	
	T produce();
	
}
