package com.zm.core.features.listimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.zm.core.features.Counter;

public class LinkedListImpl {

	private static Counter counter = new Counter();
	
	public void generalInfo() {
		System.out.println("- Linked List maintains insertion order."
				+ "\n- Duplicates and nulls are allowed"
				+ "\n- Linked lists are NOT thread safe. Use Syncronized keywork explicitly in a multi-threaded environment"
				+ "\n- Implements, List, Queue and DQueue interfaces."
				+ "\n- In java linked list implementation is doubly linked list"
				+ "\n- Accesing elements in ArrayList is using index hence quicker. In Linked list all item has to be traversed sequentially hence slower"
				+ "\n- Insertion and deletion in ArrayList is slower because the ements have to be shifted if new item is inserted in the middle."
				+ "\n- Also, Arraylist has to increase its size sometimes to accomodate new elements "
				+ "\n- The add(index, item) method, the index starts from 0."
				+ "\n- getFirst(), getLast() and get(index) method throws NoSuchElementException if the linked list is empty...."
				+ "\n- removeIf() method takes a Predicate. Internally removeIf method iterates through all elements and will pass each element one by one to the test method of predicate"
				+ "\n- Similarly forEach() method will iterate and pass each element to the action() method of Consumer as an argument."
				+ "\n- Since LInked list implements Queue and Dqueue, methods like push(), pop(), Poll(), peek() can also be used on LInked lists.");
	}
	
	public static void main(String args[]) {
		
		LinkedListImpl ll = new LinkedListImpl();
		ll.generalInfo();
		
		System.out.println("\nCreating a Linked list ......");
		
		LinkedList<String> people = new LinkedList<String>();
		people.add("Manish");
		people.add("Nitu");
		people.add("Raunav");
		people.add("Chetan");
		people.add("Rahul");
		
		System.out.println("Linked List after adding elements using add()");
		System.out.println(people);
		
		System.out.println("\n Add element at third place .....");
		people.add(3, "Mahika");
		System.out.println("After adding at 3rd location ....");
		System.out.println(people);
		
		System.out.println("\n addFirst(\"Badri\") and addLast(\"Nisha\")");
		people.addFirst("Badri");
		people.addLast("Nisha");
		System.out.println(people);
		
		List<String> others = new ArrayList<String>();
		others.add("Rohan");
		others.add("Shobha");
		others.add("Arika");
		System.out.println("\n Add a collection of string ......");
		people.addAll(others);
		System.out.println(people);
		
		List<String> others2 = new ArrayList<String>();
		others2.add("Muskaan");
		others2.add("Prabhakar");
		
		System.out.println("\naddAll(3, \"Collection\").....");
		people.addAll(3,others2);
		System.out.println(people);
		
		System.out.println("\n============ Retreival=================");
		System.out.println("\ngetFirst() : " + people.getFirst());
		System.out.println("getLast() : " + people.getLast());
		System.out.println("get(3) : " + people.get(3));
		
		
		System.out.println("\n Iterate using forEach and Lamda --------------- ");
		counter.resetCounter();
		people.forEach(name->System.out.println(counter.getNextCounter()+"." + name));
		
		System.out.println("\n Iterate using Iterator --------------- ");
		Iterator<String> it = people.iterator();
		counter.resetCounter();
		while(it.hasNext())
			System.out.println(counter.getNextCounter()+"." + it.next());
		
		System.out.println("\n Iterate using ListIterator --------------- ");
		ListIterator<String> it2 = people.listIterator();
		counter.resetCounter();
		while(it2.hasNext())
			System.out.println(counter.getNextCounter()+"." + it2.next());
		
		System.out.println("\n Iterate using Iterator and java 8 forEachRemaining --------------- ");
		it = people.iterator();
		counter.resetCounter();
		it.forEachRemaining(name->System.out.println(counter.getNextCounter()+"." + name));
		
		System.out.println("\n Iterate using DescendingIterator --------------- ");
		Iterator<String> dit = people.descendingIterator();
		counter.setCounter(people.size()+1);
		counter.setInterval(-1);
		while(dit.hasNext())
			System.out.println(counter.getNextCounter()+"." + dit.next());
		
		
		System.out.println("\n============ Removal =================");
		
		System.out.println("Remove first : " + people.removeFirst());
		System.out.println(people);
		
		System.out.println("Remove Last : " + people.removeLast());
		System.out.println(people);
		
		System.out.println("Removed Chetan? :" + people.remove("Chetan"));
		System.out.println(people);
		
		System.out.println("Remove all elements that starts with R");
		people.removeIf(p -> p.startsWith("R"));
		System.out.println(people);
		
		System.out.println("clear all using clear()");
		people.clear();
		System.out.println(people);
		
	}
	
	
}
