package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;

public class SumNegValues {
	
	public static int sumNegValues(ArrayList<Integer> list) {

        int sum = 0;   //initialize sum to 0

        for(int num: list){   //for each num in ArrayList
            if(num <0){       //if element is < 0, add to the sum
                sum+=num;
            }
        }
        //code here
        return sum;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }

}
