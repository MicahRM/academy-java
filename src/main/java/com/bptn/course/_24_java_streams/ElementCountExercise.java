package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ElementCountExercise {

	public static void main(String[] args) {
		
		
		//Declare a list of strings
		
		List<String> list =  new ArrayList<>(Arrays.asList("apple" , "banana", "cherry", "dates", "elderberry"));
		
		list.forEach((element) -> System.out.println(element)); //print elements using lambda
		
		//convert the list to a stream
		
		Stream<String> data = list.stream();  //Stream of strings named data that includes the elements of list
		
		
		//use forEach stream method to perform an action on each element of this stream -  this is a terminal operation which makes this stream unusable
		
		list.stream()
					.forEach((element) -> System.out.println(element));  //the multiple line thing is for convention, because this line can get very long
		
		//or 
		
		data.forEach((element) -> System.out.println(element)); //using the stream name
		
		
		//count the elements in the list using stream
		
		long count = list.stream()
				         .count();
		
		//or
		
		//long count1 = data
		//		         .count();  //although, this line will throw an exception because this stream has been terminated by data.forEach((element) -> System.out.println(element)); //using the stream name
		
		
		
		System.out.println("The number of elements: " + count);
		
		

	}

}
