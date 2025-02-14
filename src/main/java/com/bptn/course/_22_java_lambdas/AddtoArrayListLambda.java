package com.bptn.course._22_java_lambdas;

import java.util.ArrayList;

public class AddtoArrayListLambda {

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
		
		//using forEach() method, lambda syntax
		fruits.forEach((element) -> System.out.println(element));
		
        
		
		
	}

}


//forEach(Consumer <? super E> action) uses Consumer as an argument which is a functional interface
/*void accept(T t) -> SAM
 * and can be implemented using lambda expression
 * 
 * 
 * 
 * Consumer is a functional interface that has accept(T t) as SAM
 * 
 * Lambda expressions is just a way to implement Single Abstract Methods (SAM) within an interface
 * 
 * 
 * 
 * 
 * arrayName.forEach( (item) -> { System.out.println(item); } );
 */ 
