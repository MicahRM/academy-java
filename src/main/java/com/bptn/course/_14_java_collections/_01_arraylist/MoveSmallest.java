package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;

public class MoveSmallest {
	
	 public static void moveSmallest(ArrayList<Integer> list) {
	        int smallestIndex = 0;  //initialize smallestIndex to 0
	        for (int i = 0; i < list.size(); i++) {   //iterates the arraylist
	            if (list.get(i)< list.get(smallestIndex)) {   //if an element is less than any other element starting from index 0
	                smallestIndex = i;  //assigns the smallestIndex to the value of i to check all elements
	            }
	        }
	        //move smallest to front
	        int smallest = list.get(smallestIndex);  //stores the smallest value found
	        list.remove(smallestIndex);   //removes this value from the list
	        list.add(0,smallest);   //adds it to the front
	        
	        
	        //or  Integer smallest = list.remove(smallestIndex);
	        //    list.add(0,smallest);
	    }

	    public static void main(String[] args) {
	        //instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {3, 11, 54, 7, 1, 22};
	        for (int i = 0; i < nums.length; i ++) {
	            values.add(nums[i]);
	        }
	        moveSmallest(values);
	        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
	        System.out.println("Your Result:\t\t " + values);
	    }

}



/*
 * assume smallestIndex = 0
 * element[smallestIndex]  element[0]
 * 
 *  element[smallestIndex]  element[1] ====> 3<11
 *  
 *  
 *   element[smallestIndex]  element[2] ====> 3<54 
 *   
 *    element[smallestIndex]  element[3] ====> 3<7
 *    
 *     element[smallestIndex]  element[4] ====> 3<1? false 3>1
 *     
 *    update smallestIndex = 4
 *    
 *    element[smallestIndex]  element[5] ====> 1<22
 *    
 *     smallestIndex =4, smallest value =1
 *   
 *   
 *   
 * 
 */



