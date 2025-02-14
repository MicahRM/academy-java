package com.bptn.course._20_sorting_algorithms;

import java.util.Arrays;

public class QuickSortExample {   // QuickSort function
	
	
	
	public static void main(String[] args) {

		// Initialize the integer array
		int[] arr = { 10, 7, 8, 9, 1, 5 };

		System.out.println("Original array: " + Arrays.toString(arr));

		QuickSortExample.sort(arr);

		// print the sorted array

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void sort(int[] arr) {

		if (arr == null || arr.length == 0) {
			return;
		}

		// call the quicksort method with the left and right indices
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int left, int right) {

		// if the left index is less than the right index . then we have more elements
		// to sort
		if (left < right) {

			// return the partitionIndex
			int partitionIndex = partition(arr, left, right);
			// recursively perform the operation to the left of the partitionIndex
			quickSort(arr, left, partitionIndex - 1);
			// recursively perform the operation to the right of the partitionIndex
			quickSort(arr, partitionIndex + 1, right);
		}

	}

	private static int partition(int[] arr, int left, int right) {

		// choose the first element to be the pivot
		int pivot = arr[left];

		// initialize the left and the right pointers
		int i = left + 1;
		int j = right;
		
		while(i<=j) {
			
			//find an element on the left side to be greater than the pivot for i to stop
			
			while(i <= right && arr[i]<pivot) {
				i++;
			}
			//find an element on the right side to be smaller than the pivot for j to stop
			
			while(j >= left && arr[j]>pivot) {
				j--;
			}
			
			if(i<j) {
				
				swap(arr, i, j);
			}
		}
		
		//put the pivot at the right position
		swap(arr, left, j);
		
		//return j which is the partitionIndex
		return j;
	}
	

	private static void swap(int[] arr, int i, int j) {
		
		//swap the elements
		int temp = arr[i];
		arr[i]=  arr[j];
		arr[j] = temp;
		
		
    }
}
