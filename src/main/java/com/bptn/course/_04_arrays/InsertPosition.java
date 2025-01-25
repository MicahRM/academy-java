package com.bptn.course._04_arrays;

public class InsertPosition {

	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 7, 9 }, target = 9;
		int nums1[] = { 1, 3, 5, 6 }, target1 = 3;
		int nums2[] = { 1, 3, 5, 6, 7 }, target2 = 7;

		System.out.println(searchInsert(nums, target));
		System.out.println(searchInsert(nums1, target1));
		System.out.println(searchInsert(nums2, target2));

	}

	public static int searchInsert(int[] nums, int target) {
		// FREEZE CODE END

		        // Add the content of your method starting here
		        
		        for(int i=0; i<nums.length; i++ ){  //This is a for loop that iterates from i = 0 until 1 less than nums.length (which addresses every index of the given array)
		            if(nums[i] >= target){          //This if-statement checks to see if the numerical value at index i >= target (this determines where the target should be placed in the array when sorting in ascending order)
		                return i;        //this returns i (the array index) when a value has been found to be greater than or equal to the target value
		            }
		        }

		        return nums.length;  //if the array is traversed and there is no value that is greater than or equal to the target in the entire array then the total array length is just returned, thus printing where the target index would be if it were inserted in ascending order.
		      

}
}
