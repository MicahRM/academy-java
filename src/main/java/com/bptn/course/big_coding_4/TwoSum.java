package com.bptn.course.big_coding_4;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {

		
		// Method that returns the indices of two elements in the nums array that add up
		// to the target value
		public int[] twoSum(int[] nums, int target) {
			// Initialize a HashMap to store the value of each element in the nums array and its index
			
			Map<Integer, Integer> map = new HashMap<>(); //create a Hashmap to store the elements as keys and their indices as values
			 

			// Loop through each element in the nums array
			for (int i = 0; i< nums.length; i++) {  //for loop iterates over the array
				// Calculate the complement, which is the difference between the target and the current element
				int complement = target - nums[i];		//finds the difference between the target and the currently indexed array value.
				 

				// Check if the complement is found in the HashMap
				if (map.containsKey(complement)) {  //checks is the map contains the complement to add with the indexed value to reach the target
					/* If the complement is found, return the index of the complement and the current index because these two indices correspond to two elements that add up to the target*/
					return new int[] {map.get(complement), i}; // returns an integer array of the complement and the element index if found
				}
				// If the complement is not found, put the current element and its index into the HashMap
				
				map.put(nums[i], i); //if no complement is found it places the element and its index in the Hashmap
				
			}

			// If no two sum solution is found, throw an IllegalArgumentException
			throw new IllegalArgumentException("No two sum solution");
		}
	    // Do not modify the code below:
		// Main method to test the twoSum method
		public static void main(String[] args) {
			// Example array of integers
			int[] nums = { 2, 7, 11, 15 };

			// Example target value
			int target = 9;

			// Create a TwoSum object
			TwoSum solution = new TwoSum();

			// Call the twoSum method to get the indices of the two elements that add up to
			// the target value
			int[] indices = solution.twoSum(nums, target);

			// Print the result
			System.out.println("The indices are: " + indices[0] + " and " + indices[1]);
		}
	
}


/*
 * Summary:
 * 
 * Method that returns the indices of two elements in the nums array that add up
  to the target value
  
  
 * create a Hashmap to store the elements as keys and their indices as values
 * for loop iterates over the array
 * finds the difference between the target and the currently indexed array value.
 * checks is the map contains the complement to add with the indexed value to reach the target
 * returns an integer array of the complement and the element index if found
 * if no complement is found it places the element and its index in the Hashmap
 *  If no two sum solution is found, throw an IllegalArgumentException
 * 
 * 
 */
