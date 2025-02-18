package com.bptn.course.big_coding_4;

public class InsertionSort {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort(int[] arr) {
    	
    	// Check if the array is null or has less than 1 element
        if (arr == null || arr.length < 1) { //checks if the array is null or has less than one element
        	
        	
            // Return if the array is null or has less than 1 element
        	return;  //runs a blank return to exit the method if the above condition is true.
        }
        // Loop through the array starting from index 1 to length of the array
        for (int i = 1; i<arr.length; i++) { //for loop to iterate through array from the second element to the end
        	
        	
            // Store the current element
        	int current = arr[i]; //stores the current element at index i
            
            // Initialize j with i - 1
        	int j = i -1; //initialize j to be 1 less than i, j starts at the beginning of array
           
            // Inner loop to compare current element with elements before it in the array
            while (j>= 0 && arr[j] > current) {  //while loop to continue looping while is still within the array bounds and the value at index j is greater than the neighbouring value at index i
            	
            	
                // Shift the element to the right
            	arr[j+1] = arr[j];  // this assigns the value at index j to the index to the right of j
                
                // Decrement j to compare with next element
            	j--; // decrements j to point to its index on the left
               
            }
            // Insert the current element at its correct position
            arr[j+1] = current;  //assigns the value at the current index into j's original position to complete the swap.       
        }
    }
  //Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 4, 1, -2, 4, 8};
        // Call the sort method to sort the array
        insertionSort(arr);
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Summary: 
 * 
 * This code was very similar to a code example that we worked through together in class before.
 * One small difference was the fact that we were tasked to check if the array was null or had less than 1 element before executing the insertion sort.
 * 
 * Code Explanation:
 * 
 * insertionSort method begins with if statement that checks if the array is null or has less than one element and returns if true.
 * Then a for loop to iterate through array from the second element to the end. int current = arr[i]; stores the current element at index i
 * int j = i -1; initializes j to be 1 less than i, j starts at the beginning of array. arr[j+1] = arr[j]; assigns the value at index j to the index to the right of j
 * j--; decrements j to point to its index on the left. arr[j+1] = current;  assigns the value at the current index into j's original position to complete the swap. 
 * 
 * Main method initializes the array, then calls insertionSort with the array as an argument then prints the sorted array.
 * 
 * 
 */
