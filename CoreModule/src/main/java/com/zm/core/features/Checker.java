package com.zm.core.features;

/**
 * This is my functional interface with just one abstract method. Trying to replicate the pre-defined Predicate interface
 * @author Manish.Manjul
 */
@FunctionalInterface
interface Checker<T> {

	public static final int LENGTH_TO_CHECK= 8;
	public static final int MAX_PWD_COUNT = 10;
	/**
	 * Abstract method to test the condition and return a boolean based on the condition being true or false
	 * @param t
	 * @return
	 */
	boolean check(T t);
	
}
