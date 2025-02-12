package com.bptn.course._20_sorting_algorithms;



public class InsertionSortExample {

	public static void main(String[] args) {
		
		int[] numArray = {6,1,7,4,2,9,8,5,3};
		
		System.out.println("Elements before sorting");
		
		for(int element : numArray) {
			System.out.print(element+ " ");
			}
		
		insertionSort(numArray);
		
		
		System.out.println("\nElements after sorting");
		
		for(int element : numArray) {
			System.out.print(element+ " ");
			}
		

		
		

	}

	private static void insertionSort(int[] numArray) {
		
		for (int i = 1; i < numArray.length; i++) {
			
			int temp = numArray[i];
			int j = i=1;
			
			
			while (j>=0 && numArray[j]>temp){
				
				numArray[j+1]=numArray[j];
				j--;
			}
			numArray[j+1] = temp;
		}
		
		
	}
}
//
//pseudo code

//
//INSERTION_SORT(array)
//for i = 1 to array.length - 1 do
//    current = array[i]
//    j = i - 1
//    
//    // Shift elements in the sorted portion to the right
//    while j >= 0 AND array[j] > current do
//        array[j + 1] = array[j]
//        j = j - 1
//    
//    // Place the current element in the correct position
//    array[j + 1] = current
//end for
//END

