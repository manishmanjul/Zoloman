package com.zm.core.test;

import java.util.Comparator;

import com.zm.core.features.CustomComparator;

public class Employe implements CustomComparator<Employe>{

	int id ;
	String name;
	
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Equals of emp with id : " + this.id + " called");
		if(this == obj) return true;
		if(obj == null) return false;
		
		Employe e = (Employe) obj;
		if(this.name.equals(e.name)) return true; else return false;
		
	}
	
	@Override
	public int hashCode() {
		
		System.out.println("Hashcode of emp with id : " + this.id + " called");
		return 1;
	}

	@Override
	public int isBiggerThan(Employe t) {
		return this.name.compareTo(t.name);
	}
}
