package com.zm.core.features.mapimpl;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Test Map internal working and see how the iterator fetches values from the map's buckets and linked lists. 
 * It seems the iterator will traverse through the index sequentially and similarly the linked lists.
 * @author manishmanjul
 *
 */
public class MapImpl {

	public static void main(String args[]) {

		Hashtable<Key, Integer> myMap = new Hashtable<Key, Integer>();
		myMap.put(new Key("Manish"), 2);
		myMap.put(new Key("Nitu"), 6);
		myMap.put(new Key("Abhishek"), 1);
		myMap.put(new Key("Raunav"), 7);
		myMap.put(new Key("Manjul"), 3);
		myMap.put(new Key("Maanjul"), 4);
		myMap.put(new Key("Mzmanjul"), 5);

		Iterator<Key> it = myMap.keySet().iterator();
		while(it.hasNext()) {
			Key k = it.next();
			System.out.println(k.getKeyStr() + " : " + myMap.get(k) + " hash : " + k.hashCode() + " index : " + (k.hashCode() & 10));
		}
	}
}
