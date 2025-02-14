package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

	public static void main(String[] args) {
		
		
        // Create a list of integers
    	
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		// Use the stream method to convert the list to a stream of integers, then use the reduce method
		
		Integer result = list.stream().reduce(0, (a,e) -> a+e);
		
		//print result 
		
		System.out.println("Result: " + result);		
		
		
		//map method is squaring each element and then reduce sums these.
		
		Integer result1 = list.stream().map((element) -> element * element).reduce(0, (a,e) -> a+e);
		
		//print result1
		
		System.out.println("Result1: " + result1);
		
		
    }
	
	
}


//reduce has 2 arguments - reduce(identity, BinaryOperator<T>)
//BinaryOperator<T> is the functional interface

//reduce is a terminal operation

//0+1 = 1 -> a 
//1+2 = 3 -> a
//3+3 = 6 -> a
//6+4 = 10 -> a 

//a is an accumulator that stored the last calculated sum

//reduce is a method that reduces a list of integers into a single value. reduce also works for string concatenation and other math operations
  