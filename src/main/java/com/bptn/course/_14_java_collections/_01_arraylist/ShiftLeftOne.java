package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;

public class ShiftLeftOne {
	
	public static void shiftLeftOne(ArrayList<Integer> list) {
        //code here

        if(list.size()>1){  //checks if there are actually more than 1 element in the ArrayList
            int start = list.get(0);   //  if yes, saves the value of the starting element in a variable
        for (int i = 0; i < list.size() - 1; i++ ){  //for loop to iterate 2 less the size of the list since the first element has been handled
            list.set(i, list.get(i+1));  //sets the elements at index i to the element at i+1.

        }
        list.set(list.size() - 1, start );  //finally sets the stored first element to the end of the new list
    }
	}


    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }

}
