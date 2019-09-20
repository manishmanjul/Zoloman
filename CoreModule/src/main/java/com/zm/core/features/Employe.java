package com.zm.core.features;

public class Employe implements CustomComparator<Employe>{

	public static int BASEID = 0;
	int id ;
	String name;
	
	
	public Employe() {}
	
	public Employe(String name) {
		this.id = Employe.BASEID++;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Equals of emp with id : " + this.id + " called");
		if(this == obj) return true;
		if(obj == null) return false;
		
		Employe e = (Employe) obj;
		if(this.name.equals(e.name)) return true; else return false;
		
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
