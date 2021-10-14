package MapIterator;

import java.util.HashMap;
import java.util.Map;

public class Iterator {
	/*
	 * Write a Java Program to iterate HashMap using While and advanced for loop.
	 */
	
	// Tested in src/test/java
	public void traverse(HashMap<Integer, String> map) {
		for(Map.Entry<Integer, String> i : map.entrySet()) {
			System.out.println(i.getKey() + ": " + i.getValue());
		}
		
	}
}
