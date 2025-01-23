package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		int [] numbers = new int [] {10, 20, 30, 40, 50, 23}; 
		
		for(int i = 0; i<numbers.length;i++) {
			if(i%2 == 1) {
				System.out.println("At odd indexes, the elements are: " + numbers[i]);
			}
		}
		
		
		
		//another way
		
		
		
		//below is class example
		
		//declare and initialize the array
		int[] myArray = {10, 20, 30, 40, 50};
		
		//example1
		//print the elements at odd index-1,3,5 by incrementing i by 2 each time
		for(int i = 1; i<myArray.length; i+=2) {
			System.out.println(myArray[i]);
		}
		
		//example2
		//print the elements at odd index by finding i%2!=0 which will skip all even numbers and print odd since i%2==0 is even and i%2==1 is odd
		for(int i =0; i<myArray.length; i++) {
			if(i%2!=0) {
				System.out.println(myArray[i]);
			}
		}
		
		
		
		
		

        


	}

}
