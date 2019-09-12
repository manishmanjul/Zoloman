package com.zm.core.features;

/**
 * This is my functional interface with just one abstract method. Trying to replicate the pre-defined Predicate interface
 * @author Manish.Manjul
 */
@FunctionalInterface
interface Checker<T> {

	/**
	 * Abstract method to test the condition and return a boolean based on the condition being true or false
	 * @param t
	 * @return
	 */
	boolean check(T t);
	
}
