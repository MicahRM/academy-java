package com.bptn.course._14_java_collections_list._02_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		
		LinkedList<String> colors =  new LinkedList<>();
		
		
		//add elements to the LinkedList
		
		
		colors.add("blue");
		
		colors.add("green");
		
		colors.add("blue");
		
		colors.add("orange");
		
		colors.add("pink");
		
		
		System.out.println("Linkedlist after adding colors: " + colors);
		
		
		
		//remove an element from index 1
		
		colors.remove(1);	
		
		System.out.println("Linkedlist after rmeoving element at index 1: " + colors);
		
		
		
		//adding an element at index 1
		
		colors.add(1, "purple");
		
		System.out.println("Linkedlist after adding an element at index 1: " + colors);
		
		
		
		//accessing an element at index 2
		
		colors.get(2);
		
		System.out.println("Linkedlist after accessing an element at index 2: " + colors.get(2));
		
		
		//adding a null value
		
		colors.add(null);
		
		System.out.println("Linkedlist after adding null value: " + colors);
		
		
		//accessing elements in a LinkedList using a for loop
		
		for(int i = 0; i<colors.size(); i++) {
			
			System.out.println(colors.get(i));
		
		}
		
		
		
		//accessing elements in a LinkedList using a for each loop
		
		for(String element : colors) {
					
			System.out.println(element);
				
		}
		
		
		//accessing elements in a LinkedList using an Iterator
		
		
		Iterator<String> it = colors.iterator();  //create iterator object for the LinkedList
		
		while(it.hasNext()) {   //while a next element exists in the iterator/LinkedList
			
			System.out.println("Accessing next element using the iterator: " + it.next());   //prints next iterator element
		}
		
		
		
		//remove an element using an iterator
		
		Iterator<String> iterator = colors.iterator(); //need a new Iterator object since the one before has already reached the end
		
		
		System.out.println("Accessing next element using the iterator: " + it.next());
		
		while (iterator.hasNext()) {
			
			if(iterator.next().equals("purple")) {  //remove purple
				iterator.remove();
	            System.out.println("The color is removed successfully");	
			
			}
		}
		
		
		
		//adding an element using ListIterator interface (sub interface of Iterator)
		
		
		ListIterator<String> listIterator = colors.listIterator();
		
		
		while(listIterator.hasNext()) {
			
			
			String color = listIterator.next();
		    
			if(color.equals("orange")) {
				listIterator.add("black");
				System.out.println("Color  added successfully");
			}
		}
		
		System.out.println("Updated LinkedList: " + colors);
				
		
		
		
		
	
	}

}

//it allows duplicates

//use ListIterator to add elements to a list and also to traverse forwards or backwards
/*
 * allows null values
 * can preserve insertion order
 * can remove an element from the collection using Iterator
 * can add an element to the collection using ListIterator
 * 
 * 
 */



