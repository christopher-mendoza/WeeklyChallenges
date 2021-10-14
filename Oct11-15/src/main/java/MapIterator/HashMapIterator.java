package MapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {
	/*
	 * Write a Java Program to iterate HashMap using While and advanced for loop.
	 */
	
	// Tested in src/test/java
	public void traverse(HashMap<Integer, String> map) {
		// This is while loop traversal 
		System.out.println("*****WHILE LOOP TRAVERSAL*****");
		Iterator i = map.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> enw = (Map.Entry) i.next();
			System.out.println(enw.getKey() + ": " + enw.getValue());
		}
		
		System.out.println();
		// This is enhanced for loop traversal
		System.out.println("*****ENHANCED FOR LOOP TRAVERSAL*****");
		for(Map.Entry<Integer, String> enf : map.entrySet()) {
			System.out.println(enf.getKey() + ": " + enf.getValue());
		}
		
	}
}
