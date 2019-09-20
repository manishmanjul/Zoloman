package com.zm.core.features.listimpl;

import java.util.ArrayList;
import java.util.List;

import com.zm.core.features.Employe;

public class ArrayListImpl {

	List<Integer> intList = new ArrayList<Integer>();
	List<String> strList = new ArrayList<String>();
	List<Employe> objList = new ArrayList<Employe>();
	
	// Add values to the list.
	private void populateArrayList() {
		intList.add(new Integer(5));
		intList.add(new Integer(2));
		intList.add(new Integer(15));
		intList.add(new Integer(25));
		intList.add(new Integer(4));
		intList.add(new Integer(8));
		intList.add(new Integer(10));
		
		strList.add("Catlin");
		strList.add("Cisco");
		strList.add("Barry");
		strList.add("Eobard");
		strList.add("Iris");
		strList.add("Ralph");
		strList.add("Gypsy");
		
		objList.add(new Employe("Oliver Queen"));
		objList.add(new Employe("Falicity Smoke"));
		objList.add(new Employe("Thea Queen"));
		objList.add(new Employe("Ray Palmer"));
		objList.add(new Employe("Laurel Lance"));
		objList.add(new Employe("John Diggle"));
		objList.add(new Employe("Sara Lance"));
		objList.add(new Employe("Ras Al Gul"));
	}
	
	public ArrayListImpl() {
		populateArrayList();
	}
	
	private void testListIterator() {
		
	}
	
	private void testContains() {
		
		// Test contains for an Integer Object
		System.out.println("************** List<Integer> *************T");
		System.out.println("Check for primitive type 5 : " + intList.contains(5));
		System.out.println("Check for Integer object type 25 : " + intList.contains(new Integer(5)));
		System.out.println("Check for primitive type 20 that does not exist : " + intList.contains(20));
		System.out.println("Check for Integer object type 20 that does not exist : " + intList.contains(new Integer(20)));
		System.out.println("Although the intList contains objects of type Integer, it does not matter if we look for just "
				+ "the number 5 or Integer(5). It returns true if the numeric value exist..");
		
		System.out.println("\n");
		
		// Test contains for String Object
		System.out.println("************** List<String> *************T");
		System.out.println("Check for string Catlin that exist : " + strList.contains("Catlin"));
		System.out.println("Check for string Manish that does not exist : " + strList.contains("Manish"));
		System.out.println("Check for new String(\"Cisco\") that exist : " + strList.contains(new String("Cisco")));
		System.out.println("In case of Strings, it checks for the value and not the reference. Returns true if the specifid string exists irrespective of "
				+ "how the string is represented \"As aliteral\" or as new String() \n\n");
		
		
		// Test contains for Custom Object
		System.out.println("************** List<Employee> *************T");
		System.out.println("Check for Employee Oliver Queen that exist : " + strList.contains(new Employe("Oliver Queen")));
	}
	
	public static void main(String args[]) {
		ArrayListImpl arrayListImpl = new ArrayListImpl();
		arrayListImpl.testContains();
	}
}
