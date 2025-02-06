package com.bptn.course._16_java_collections_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

		// populate the LinkedHashMap

		linkedHashMap.put("Jane", 24);
		linkedHashMap.put("John", 30);
		linkedHashMap.put("Cherry", 29);
		linkedHashMap.put("Mango", 20);
		linkedHashMap.put(null, 20);
		linkedHashMap.put("Sweytha", null);
		linkedHashMap.put("Joe", null);
		linkedHashMap.put("John", 35);

		System.out.println(linkedHashMap);

		// access a value in a linkedHashMap

		System.out.println("Jane's age: " + linkedHashMap.get("Jane"));

		// .keySet() method returns the Set view of the keys
		// .get(Object k) method returns the actual object that corresponds with the
		// specified key.

		for (String key : linkedHashMap.keySet()) {

			System.out.println("Name: " + key + "Age:" + linkedHashMap.get(key));

		}

		// iterating through hashMao using entrySet() method which prints the entire
		// entry (key, value)

		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {  //for entry traversal

			System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue());

		}
		
		
		System.out.println("Using a Iterator through LinkedHashMap: ");
		
		Iterator<Map.Entry<String, Integer>> iterator = linkedHashMap.entrySet().iterator();  //to iterate entrySet
		
		while(iterator.hasNext()) {
			
			Map.Entry<String,Integer> entry = iterator.next();
			
		    System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue());
		    
		}
		
	
	}

}

/*
 * LinkedHashMap preserves insertion order because it uses a LinkedList to Map
 * the Key value pairs 
 * 
 * allows maximum one null for the key but allows multiple
 * null values for the value (similar to list)
 * 
 *  
 *  overrides the value of an
 * existing key when a key of the same name is added. 
 * 
 * allows duplicates for the
 * values but will only take the latest value for a given key
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
