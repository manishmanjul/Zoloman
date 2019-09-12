package com.zm.core.features;

public class UsingChecker {

	private Checker<String> checker;
	
	public UsingChecker() {
		checker = (t) -> t.length() >8;		
	}
	
	public Checker<String> getChecker() {
		return this.checker;
	}
	
	public static void main(String args[]) {
		UsingChecker c = new UsingChecker();
		System.out.println(c.getChecker().check("Dabra")?"Looks OK":"Try again. Length has to be more than 8");
	}
	
}
