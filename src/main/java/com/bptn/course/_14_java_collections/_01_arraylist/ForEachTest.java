package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;

public class ForEachTest {
	
	public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        for (int num: nums) {
            values.add(num);
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }

}
