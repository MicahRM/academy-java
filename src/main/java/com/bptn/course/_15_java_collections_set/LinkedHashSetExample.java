package com.bptn.course._15_java_collections_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		
		
		//create the LinkedHashSet for String objects
		
		
		Set<String> linkedHashSet = new LinkedHashSet<>();	
		
		
		//add values
		
		linkedHashSet.add("banana");
		linkedHashSet.add("apple");
		linkedHashSet.add("mango");
		linkedHashSet.add("cherry");
		linkedHashSet.add("banana");  //LinkedHashSet also doesn't allow duplicates for the same reason as a regular HashSet
		                              //identical items have the same key value 
		
		
		//print the LinkedHashSet
		
		System.out.println("The linkedHashSet is: " + linkedHashSet);
		
		// Create a LinkedHashSet and populate it with initial elements
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("tiger");
        set.add("lion");

        // Print the size of the set
        System.out.println("Set size: " + set.size());

        // Use for each loop to print the elements in the set
        System.out.println("Elements in the set (using for-each loop):");
        for (String element : set) {
            System.out.println("Element: " + element);
        }

        // Use iterator to print the elements in the set
        Iterator<String> iterator = set.iterator();
        System.out.println("Elements in the set (using iterator):");
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Use remove() method to remove an element from the set
        set.remove("dog");
        System.out.println("Set after using remove(): " + set);

        // Check if an element exists in the LinkedHashSet
        System.out.println("Does LinkedHashSet contain 'dog'? " + set.contains("dog"));

        // Use clear() method to remove all elements from the set
        set.clear();
        System.out.println("Set after using clear(): " + set);

	}

}


/*
 *it preserves insertion order
 * does not allow duplicates
 * allows a maximum of 1 null value
 * uses HashTable and LinkedList to store information
 * 
 * preserves insertion order because of the use on LinkedList
 * 
 * 
 * Set is not indexed, therefore can only use for-each loop and not for loop
 * HashSet is not indexed
 */
