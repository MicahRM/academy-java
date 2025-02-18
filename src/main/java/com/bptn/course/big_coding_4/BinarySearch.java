package com.bptn.course.big_coding_4;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		
		Arrays.sort(arr);  //sorts the array
				
 		
		
		// Initialize low and high pointers for the start and end of the array respectively
		
		int low = 0;  //initializes low to the index value of the start of the array
		int high = arr.length -1;  //initializes low to the index value of the start of the array
	

		// Keep looping until the high pointer is greater than or equal to the low pointer
		while (low <= high) {  //while loop that loops while the low pointer is less than or equal to high
			// Calculate the middle index
			
			int mid = (low+high)/2;   //calculate the mid value by adding the low and high pointer value and then dividing by 2.
			
			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) { 
				return mid;			 //checks if the value at arr[mid] is equal to the key and returns mid if it is.	
			}
			// If the element at the middle index is less than the key, move the low pointer to the middle + 1
			else if (arr[mid] < key) {
				
				low = mid +1;			//if the value at mid is less than the key value it then moves the low to point 1 element to the right of the previous mid	
			}
			// If the element at the middle index is greater than the key, move the high pointer to the middle - 1
			else {
				
				high = mid -1;    //else if the value at mid is greater than the key, the high pointer is then moved to the index to the left of the previous mid
				
			}
		}
		// If the key is not found, return -1
		
		
		return -1;  //returns 1 if the key is not located
		
	}

    //Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}



/*
 * Summary: 
 * 
 * This example is very similar to an example that we've previously worked through in class except this problem works with array and uses Arrays.sort()
 * to sort the array initially.
 * 
 * Binary search method that takes an unsorted array and a key element to search for. This method first sorts the array.
 * Then, initializes low to the index value of the start of the array and initializes low to the index value of the start of the array
 * Then, a while loop that loops while the low pointer is less than or equal to the high pointer. Next, calculate the mid value by adding the low and high pointer value and then dividing by 2 
 * checks if the value at arr[mid] is equal to the key and returns mid if it is.	
 * if the value at mid is less than the key value it then moves the low to point 1 element to the right of the previous mid	
 * else if the value at mid is greater than the key, the high pointer is then moved to the index to the left of the previous mid
 * returns 1 if the key is not located 
 * 
 * 
 * 
 */




