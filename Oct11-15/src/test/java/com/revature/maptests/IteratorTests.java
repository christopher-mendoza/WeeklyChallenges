package com.revature.maptests;

import java.util.HashMap;
import MapIterator.Iterator;

import org.junit.Test;

public class IteratorTests {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	Iterator I = new Iterator();
	
	@Test
	public void traverseTest() {
		map.put(4, "my");
		map.put(1, "Hi,");
		map.put(3, "is");
		map.put(2, "this");
		map.put(5, "hashmap");
		map.put(7, "function");
		map.put(6, "traversal");
		
		I.traverse(map);
	}
	
}
