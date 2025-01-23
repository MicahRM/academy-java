package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		
		
		//declare and initialize and array
		int[] myArray = {3,5,7,9,11,13}; //index will be 0,1,2,3,4,5
		
		
		
		//print the first element of the array to the console
		System.out.println("First element of the array: " + myArray[0]);
		
		
		
		// print the second element of the array to the console
		System.out.println("Second element of the array: " + myArray[1]);
		
		
		
		//update the first element of the array to 30
		myArray[0] = 30;
		System.out.println("First element of the array: " + myArray[0]); //just to see the change
		
		
		
		//access and print the last element of the array without referencing the index.
		System.out.println("The last element of the array: " + myArray[myArray.length-1]);
		
		
		
		//update the last element without referencing the index
		myArray[myArray.length-1] = 130;
		System.out.println("The last element of the array: " + myArray[myArray.length-1]); //prints out the updated value of the last element
		
		
		
		//print the elements of the array using a for loop
		for(int i = 0; i<myArray.length;i++) {
			System.out.print( myArray[i] + " ");
		}
		
		
		
		System.out.println(" "); //creates a space
		
		
		
		//print the elements of the array in reverse using a for loop
		for(int i = myArray.length-1; i>=0;i--) {
			System.out.print( myArray[i] + " ");
		}
		
		
		
		System.out.println(" "); //creates a space
		
		
		//print the elements of the array using a for-each loop
		for(int i : myArray) { //can call 'i' anything this is just a variable to store the current element value in the traversal. can be considered an index
			System.out.print(i + " ");
		}
		
		
		System.out.println(" "); //creates a space
		
		
		//prints all elements in the array in one go without using loops
		System.out.print(Arrays.toString(myArray));
		
		

	}
}


//for-each loop is used to traverse a collection that is not indexed. ex. Set
//for-each loop only traverses in the forward direction
//regular for loop is used to traverse an array or collection that is indexed(the end value is known) and can traverse forwards and backwards ex. ArrayLists


