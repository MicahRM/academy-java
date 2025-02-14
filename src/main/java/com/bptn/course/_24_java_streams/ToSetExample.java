package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {

	public static void main(String[] args) {
		
		//declare list of strings
		List<String> list =  new ArrayList<>(Arrays.asList("apple" , "banana", "cherry", "dates", "elderberry"));
		
		//List to set conversion
		Set<String> newSet = list.stream()
								 .collect(Collectors.toSet());
		
		
		//printing the newSet
		newSet.stream()
		      .forEach((element)-> System.out.println(element));
	}

}
