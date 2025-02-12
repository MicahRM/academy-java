package com.bptn.course._19_search_algorithms;

public class ArraySearcher {
	

	   /** Finds the index of a value in an array of integers.
	     * @param elements an array containing the items to be searched.
	     * @param target the item to be found in elements.
	     * @return an index of target in elements if found; -1 otherwise.
	     */
	    public static int sequentialSearch(int[] elements, int target) 
	    {
	        for (int j = 0; j < elements.length; j++) 
	        {
	            if (elements[j] == target) 
	            {
	                return j; //return the index where the target is present
	            }
	        }
	        return -1;  //return -1, if no target is present
	    }
	    
	    public static int sequentialSearch(String[] elements, String target) {
	        for (int j = 0; j < elements.length; j++) {
	            if (elements[j].equals(target)) {
	                return j;
	            }
	        }
	     return -1;
	   }

	   
	

	    public static void main(String[] args) 
	    {
	        int[] numArray = {3, -2, 9, 38, -23};
	        System.out.println("Tests of sequentialSearch");
	        System.out.println(sequentialSearch(numArray,3));
	        System.out.println(sequentialSearch(numArray,9));
	        System.out.println(sequentialSearch(numArray,-23));
	        System.out.println(sequentialSearch(numArray,99));
	        
	        
	        String[] arr1 = {"blue", "red", "purple", "green"};

	        // test when the target is in the array
	        int index = sequentialSearch(arr1,"red");
	        System.out.println(index);

	        // test when the target is not in the array
	        index = sequentialSearch(arr1,"pink");
	        System.out.println(index);
	    }
	


}


/*
 * Major Key Takeaways
 * 
 * Linear search has different scenarios:
 * 
 * Best - the element is present at the beginning
 * 
 * Worst -  when the element is at the end or does not exist
 * 
 * Average - the element is in the middle
 * 
 * As the data being searched increases, the Time Complexity increases linearly O(n).
 * 
 * O(n) - is the linear time complexity and therefore Linear Search has linear complexity as the size of data increases.
 * 
 * n - number of elements
 * 
 * 
 * O(1) - constant time - access an element using an index, immediately
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
