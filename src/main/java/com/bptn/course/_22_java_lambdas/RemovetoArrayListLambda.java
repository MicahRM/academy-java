package com.bptn.course._22_java_lambdas;

import java.util.ArrayList;

public class RemovetoArrayListLambda {

	public static void main(String[] args) {
		
		
		//declare an ArrayList 
		
		ArrayList<String> fruits = new ArrayList<>();
				
				
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("mango");
				
				
		//traditional way of implementation
				
				
		for(String element : fruits) {
			System.out.println(element);
					
		}
		
		fruits.forEach((element) -> System.out.println(element)); //print elements using lambda
		
		//using removeIf() method, lambda syntax
		fruits.removeIf((element) -> element.equals("cherry"));  //must return a boolean because SAM returns a boolean in this case.
				
		 System.out.println("Arraylist after removing an element: ");
		 
		 fruits.forEach((element) -> System.out.println(element));


	}

}


/*
 * removeIf(Predicate<? super E> filter)
 * boolean test(T t) -> SAM and can be implemented using lambda expression
 * 
 * Predicate is a functional interface that has test(T t) as SAM
 * 
 * Lambda expressions is just a way to implement Single Abstract Methods (SAM) within an interface
 * 
 */




