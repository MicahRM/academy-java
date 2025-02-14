package com.bptn.course._22_java_lambdas;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        //Declare and initialize a list of strings using an ArrayList and the Arrays.asList method
    	
    	List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");        
    	
    	
        //Print the string without sorting
        System.out.println("Before sorting " + strings);

        // Sort the list of strings in ascending order using a lambda expression
        
        strings.sort((a,b) -> a.compareTo(b));
        

        // Print the sorted list of strings
        System.out.println("After sorting " + strings);
        
        strings.sort((a,b) -> -a.compareTo(b)); //works to print the list in reverse alphabetical order
        
        strings.sort((a,b) -> b.compareTo(a)); // also works to print the list in reverse alphabetical order
    }
}
/*
 * Sort(Comparator<? super E> c) -> Comparator is functional interface
 * int compare(T o1, T o2) -> SAM(Single Abstract Method)
 * 
 * 
 * 
 */



