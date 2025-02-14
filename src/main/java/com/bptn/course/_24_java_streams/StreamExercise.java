package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {

    public static void main(String[] args) {
    	
    	
        // Create a list of strings
    	
    	List<String> words =  new ArrayList<>(Arrays.asList("apple" , "banana", "cherry", "dates", "elderberry"));
         

        // Count the number of elements in the list
    	// Use the stream() method to convert the list to a stream of strings
        // Use the count() terminal operation on the stream of strings
         
    	
    	long count = words.stream().count();

        // Print the count
        System.out.println("Count numbers of words in the list " + count );
		
		// Iterate over the list and print each word using a lambda expression
		
        words.stream()
             .forEach((element) -> System.out.println(element));
		
		
		// Using a method reference, transform words to uppercase
		// map() is an intermediate operation that transforms each word to uppercase
		// collect is a terminal operation that collects the results into a list
        
        words.stream().map((element) -> element.toUpperCase()).toList();		
        
        //or
        
       List<String> newList = words.stream().map(String :: toUpperCase).toList();
       
       //or create list using Collectors
       
       words.stream().map(String :: toUpperCase).collect(Collectors.toList());
       
		// Print the list of words in uppercase
		System.out.println("Words in upper case " +  newList);
	}
}

//count is a terminal operation

//forEach() is a terminal operation
//Consumer is the functional interface
//void accept(T t) -> SAM.