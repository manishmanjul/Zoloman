package com.zm.core.features.listimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.zm.core.features.Employe;

public class ArrayListImpl {

	List<Integer> intList = new ArrayList<Integer>();
	List<String> strList = new ArrayList<String>();
	List<Employe> objList = new ArrayList<Employe>();
	private static int COUNTER = 1;
	
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
	
	private void testSpliterator() {
		
	}
	
	private void testListIterator() {		
		
		System.out.println("\n==================Testing LIST ITERATOR Method =============\n");
		ListIterator<Employe> lIt = objList.listIterator();
		
		System.out.println("Print entire list using ListIterator....");
		while(lIt.hasNext())
			System.out.println(lIt.nextIndex() + ". " + lIt.next().getName());
		
		System.out.println("\nMove 5 steps backwards....");
		for(int i=0;i<5;i++) {
			System.out.println(lIt.previousIndex() + ". " + lIt.previous().getName());
		}
		
		System.out.println("Move 2 steps forward .....");
		for(int i= 1; i<=2;i++){
			System.out.println(lIt.nextIndex()+ ". " + lIt.next().getName());
		}
		
		System.out.println("Remove current item and print all remaining items using forEachRemaining....");
		lIt.remove();
		ArrayListImpl.setCounter(lIt.nextIndex());
		lIt.forEachRemaining(i -> System.out.println(ArrayListImpl.getNextCounter() + ". " + i.getName()));
		
		System.out.println("Print entire list by traversing backwards....");
		while(lIt.hasPrevious())
			System.out.println(lIt.previousIndex() + ". " + lIt.previous().getName());	
		
		System.out.println("\n 1. Index in case of ListIterator starts from 0."
				+ "\n 2. After the last item is processed. the next() throws NoSuchElementException"
				+ "\n 3. ForEachRemaining method leaves the cursor at the END of the list. So the call to the next() will throw NoSuchElementException"
				+ "\n 4. ForEachREmaining() is defined in Iterator and NOT in ListIterator.");
	}
	
	private void testContains() {
		System.out.println("\n==================Testing CONTAINS Method =============\n");
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
		System.out.println("Check for Employee Oliver Queen that exist : " + objList.contains(new Employe("Oliver Queen")));
		System.out.println("In case the arraylist contains user objects, the user class should implement equals method and then contain method will eturn true only if the equals returns true.");
	}
	
	private void testSubList() {
		System.out.println("\n==================Testing SUBLIST Method =============\n");
		
		System.out.println("Printing the extracted Sublist.....");
		List<Employe> subList = objList.subList(2, 6);
		int i = 1;
		for(Employe e : subList)
			System.out.println(i++ + ". " + e.getName());
		
		Employe e = subList.get(2);
		e.setName("Manish");
		System.out.println("\nName changed for third element employee to Manish.... Now lets see the change to the sublist and the main list");
		System.out.println("Printing Sublist .......");
		i = 1;
		for(Employe e1 : subList)
			System.out.println(i++ + ". " + e1.getName());
		
		System.out.println("\nPring the main list .....");
		i = 1;
		for(Employe e1 : objList)
			System.out.println(i++ + ". " + e1.getName());
		
		System.out.println("\nThe change is reflected even in th emain list. So : - \n"
				+ "1. Sublist is just a view of the main list. Not a copy. Change in Sublist reflects to the main list as well.\n"
				+ "2. The get(x) method also return a reference not a copy of the item. Change to the extracted object reflects back to the list as well.");
		
	}
	
	public static void main(String args[]) {
		ArrayListImpl arrayListImpl = new ArrayListImpl();
		arrayListImpl.testContains();
		arrayListImpl.testSubList();
		arrayListImpl.testListIterator();
	}
	
	public static int getNextCounter() {
		return COUNTER++;
	}
	
	public static void resetCounter() {
		COUNTER = 1;
	}
	
	public static void setCounter(int val) {
		COUNTER = val;
	}
}
