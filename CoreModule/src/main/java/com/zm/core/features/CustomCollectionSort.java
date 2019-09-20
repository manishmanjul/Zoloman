package com.zm.core.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomCollectionSort<E>{

	Comparator<Integer> integerComparator;	
	Comparator<Character> charComparator;
	Comparator<CustomComparator> objectComparator;
	
	
	private void initComparators() {
		integerComparator = (i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0;	
		charComparator = (c1,c2) -> (c1<c2)?1:(c1>c2)?-1:0;
		objectComparator = (e1,e2) -> e1.isBiggerThan(e2);
	}
	
	public void sort(List myList){
		Comparator<Integer> c = (i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0;	
		Collections.sort(myList,c);
		
		for(Integer i : (List<Integer>)myList)
			System.out.println(i);
	}
	
	public static void main(String args[]) {
		CustomCollectionSort<Integer> cc = new CustomCollectionSort<Integer>();
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(new Integer(1));
		arrlist.add(new Integer(5));
		arrlist.add(new Integer(8));
		arrlist.add(new Integer(2));
		arrlist.add(new Integer(6));
		
		
		cc.sort(arrlist);
		
		
	}
}
