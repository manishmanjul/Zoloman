package com.zm.core.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class TestPrj {
	
	public static void main(String args[]) {
		Employe e1 = new Employe();
		e1.id = 1;
		e1.name= "Manish";
		
		Employe e2 = new Employe();
		e2.id=2;
		e2.name="Manjul";
		
		if(e1.equals(e2))
			System.out.println("Objects are equal...");
		else
			System.out.println("Objects are not equal....");		
		
		e2.name="Manish";
		if(e2.equals(e1))
			System.out.println("Objects are equal...");
		else
			System.out.println("Objects are not equal....");	
		
		HashSet<Employe> mySet = new HashSet<Employe>();
		e2.name="Manjul";
		mySet.add(e1);
		mySet.add(e2);
		System.out.println("Adding to hashset done...");
		Iterator<Employe> it = mySet.iterator();
		Employe e = null;
		while(it.hasNext()) {
			e = it.next();
			System.out.println(e.name);
		}
		
	}

}
