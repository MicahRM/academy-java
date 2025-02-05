package com.bptn.course._14_java_collections_list._01_arraylist._coding_33;

import java.util.ArrayList;
import java.util.List;

public class Main {    //convert an array to ArrayList
	
	

    // Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
    	
    	List<String> newList = new ArrayList<>();
    	
        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.

    	for(String element: inputArray) {	
    		
    		newList.add(element);    	
    	}    	
        // return the new list with elements.
    	
    	return newList;    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }

}
