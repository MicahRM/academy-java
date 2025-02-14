package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		
		

		//Declare a list of strings
		
		List<String> list =  new ArrayList<>(Arrays.asList("apple" , "banana", "cherry", "dates", "elderberry"));
		
		//convert list to a stream
		//perform a filter operation
		
		list.stream()
			.filter((element) -> element.contains("e"));
		
		//or
		
		Stream<String> data = list.stream();
		
		data.filter((element) -> element.contains("e"));
		
		
		
		//to print now
		
		list.stream()
			.filter((element) -> element.contains("e"))
			.forEach((element) -> System.out.println(element));
	}

}

//Predicate is a functional interface  for filter which is an intermediate operation
//boolean test(T t) is - SAM


//forEach() is a terminal operation with the functional interface Consumer