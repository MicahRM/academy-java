package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringSorter {

	public static void main(String[] args) {
		
		
		//Declare a list of strings
		
		List<String> list =  new ArrayList<>(Arrays.asList("apple" , "banana", "cherry", "dates", "elderberry"));
		
		//convert list to a stream
		//sort the elements in the stream
		//print all the elements in the stream
		
		list.stream()
		    .sorted((a,b) -> a.compareTo(b))
		    .forEach((element) -> System.out.println(element));
		
		//alternate syntax
		
		Stream<String> data = list.stream();
		
		Stream<String> sortedData = data.sorted((a,b) -> a.compareTo(b));
		
		sortedData.forEach((element) -> System.out.println(element));		
		
		}
		
	}
	
//Comparator is a functional interface  for sorted
//int compare(T o1, T o2) is - SAM
	
//Consumer is a functional interface for forEach
//void accept(T t) is SAM

//sorted is an intermediate operation
//forEach is a terminal operation
//terminal operations terminate the stream.