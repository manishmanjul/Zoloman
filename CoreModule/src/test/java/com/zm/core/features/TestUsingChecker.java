package com.zm.core.features;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUsingChecker extends TestCase{

	@Test
	public void testPassingFunctionalInterfaceToMethod() {
		FunctionalInterfaceInAction c = new FunctionalInterfaceInAction();
		assertTrue(takeFunctional(c.getChecker()));
	}
	
	
	private boolean takeFunctional(Checker<String> c) {
		return c.check("Sholey123");
	}
}
