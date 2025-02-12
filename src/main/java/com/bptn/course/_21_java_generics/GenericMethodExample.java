package com.bptn.course._21_java_generics;

public class GenericMethodExample {
	
	
//
//	private static int findIndexForIntegerArray(Integer[] intArray, int target) {
//		
//		
//		//linear search
//		for (int i = 0; i < intArray.length; i++) {
//			
//			if(intArray[i] == target) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//	
//	
//		private static int findIndexForDoubleArray(Double[] doubleArray, double target) {
//			
//			
//			//linear search
//			for (int i = 0; i < doubleArray.length; i++) {
//				
//				if(doubleArray[i] == target) {
//					return i;
//				}
//			}
//		
//		
//		return -1;
//	}
//		
//		
//  private static String findIndexForStringArray(String[] stringArray, String target) {
//			
//			
//			//linear search
//			for (int i = 0; i < stringArray.length; i++) {
//				
//				if(stringArray[i] == target) {
//					return target;
//				}
//			}
//		
//		
//		return null;
//	}
	
	
	//this can all be simplified using a generic method:
	
	
	
	private static <T>int findIndex(T[] array, T target){
		
		

		//linear search
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] == target || array[i].equals(target)) {
				return i;
			}
		}
	
	
	return -1;
}
	
	
	
//	private static <T>int findIndex(T[] array, T target){  //can make the int in here T to return any type!
//		
//		
//
//		//linear search
//		for (int i = 0; i < array.length; i++) {
//			
//			if(array[i] == target) {
//				return target;
//			}
//		}
//	
//	
//	return null;
//}
//		
//	

	public static void main(String[] args) {
		
		//declare an array
		Integer[] intArray = {10,20,30,40,50};
		
		int index = findIndex(intArray,40);
		
		//declare an array
        Double[] doubleArray = {10.1,20.1,30.3,40.4,50.5};
				
		double index1 = findIndex(doubleArray,40.4);
		
		//declare an array
        String[] stringArray = {"apple","banana","cherry","mango"};
				
		int index2 = findIndex(stringArray,"cherry");
		
		System.out.println("The Integer index is: " + index);
		
		System.out.println("The Double index is: " + index1);
		
		System.out.println("The String index is: " + index2);
				
				
		
		
	}

	}





/*
 * generic methods improves reusability by accepting any object of Type T
 * 
 * improves readability of the code
 * 
 * we don't have to create separate methods that implement the same logic but for different types
 * 
 * 
 * 
 */
 



