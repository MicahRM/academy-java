package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilterCountExercise {

	public static void main(String[] args) {
		
		
		//Declare a list of strings
		
		List<String> list =  new ArrayList<>(Arrays.asList("apple" , "banana", "cherry", "dates", "elderberry"));
				
		//convert list to a stream
		//perform a filter operation
				
		long value = list.stream()
						 .filter((element) -> element.length() >5)
						 .count();
		
		
		System.out.println("Number of elements after filtering: " +value);
				

	}

}


//Predicate is a functional interface  for filter which is an intermediate operation
//boolean test(T t) is - SAM

//count() -> terminal operation
