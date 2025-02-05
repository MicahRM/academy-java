package com.bptn.course._15_java_collections_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//create a String HashSet object
		
		Set<String> hashSet = new HashSet<>();
		
		//add some string values into this set
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple");   //can add this element but it will not be shwon in HashSet, no duplicates
		
		
		hashSet.add(null);
		
		System.out.println("The HashSet is: " + hashSet);
		
		
		
		
		
	}

}


/*  does not allow duplicates
 *  does not preserve insertion order
 *  allows maximum 1 null value because of the no duplication rule
 *   HashSet internally uses a HashTable which internally uses a HashMap
 *   every element is stored using a key and the value is calculated , this is why not duplicates allowed because identical objects would have identical keys
 *   
 *   
 *   does not preserve insertion order because the computation of the has can place the element in any "bucket"
 * 
 * 
 * 
 */



