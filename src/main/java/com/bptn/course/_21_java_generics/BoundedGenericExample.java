package com.bptn.course._21_java_generics;



class BoundedGeneric<T extends Number>{  //this is bounded and can only accept integers or doubles (any subtype of Class Number)
	
	
	private T value;
	
	public BoundedGeneric(T value) {
		this.value = value;
	}
	
	
	public T getValue(){
		
		return this.value;
	}
}

//class BoundedGeneric<T>{  //this is not bounded works for any type specified in object creation with no bounds
//	
//	
//	private T value;
//	
//	public BoundedGeneric(T value) {
//		this.value = value;
//	}
//	
//	
//	public T getValue(){
//		
//		return this.value;
//	}
//}

public class BoundedGenericExample {

	public static void main(String[] args) {
		
		BoundedGeneric<Integer> intExample = new BoundedGeneric<>(20);
		
		BoundedGeneric<Double> doubleExample = new BoundedGeneric<>(20.1);
		
		//BoundedGeneric<String> stringExample = new BoundedGeneric<>("Hello Java");
		
		System.out.println("Integer value: " + intExample.getValue());
		
		System.out.println("Double value: " + doubleExample.getValue());
		
		//System.out.println("String value: " + stringExample.getValue());
		

	}

}


/*
 * BoundedGeneric<T extends Number> - T is a bounded parameter type which has to be a sub class of Number
 * 
 * BoundedGeneric<String> stringExample = new BoundeGeneric<>("Hello java") will not work for BoundedGeneric method that extends Number
 * 
 * 
 * 
 * 
 * 
 */
