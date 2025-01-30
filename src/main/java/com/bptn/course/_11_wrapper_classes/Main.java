package com.bptn.course._11_wrapper_classes;

public class Main {

	public static void main(String[] args) {
		
		
		//Autoboxing - converting primitive data types into a Wrapper class. int -> Integer
		Integer intObject = Integer.valueOf(100);
		
		//this also works
		Integer intObject1 = 200; // more preferred syntax
		
		
		//Unboxing - converting Wrapper class to primitive type
		int intPrimitive = intObject; //more preferred syntax
		
		//this also works
		int intPrimitive1 = intObject1.intValue();	
		
		
		

	}

}

/*
 * Major Key TAKEAWAYS
 * 
 * We will use Wrapper class to store data in Java collections -> List, Set, Map
 * and interfaces -> ArrayList, LinkedList, HashMap, HashSet, TreeSet, LinkedHashSet, LinkedHashMap, TreeMap
 * it is used in Java generics 
 * 
 */
