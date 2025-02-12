package com.bptn.course._21_java_generics;

//
//class IntBox{
//	
//	//instance variables
//	
//	private Integer value;
//	
//	public IntBox(Integer value) {
//		this.value = value;
//}
//	
//	
//	
//	public Integer getValue() {
//		return this.value;
//	}
//	
//	class DoubleBox{
//		
//		//instance variables
//		
//		private Double value;
//		
//		public DoubleBox(Double value) {
//			this.value = value;
//	}
//		
//		
//		
//		public Double getValue() {
//			return this.value;
//		}
//	}
//	
//	
//    class StringBox{
//		
//		//instance variables
//		
//		private String value;
//		
//		public StringBox(String value) {
//			this.value = value;
//	}
//		
//		
//		
//		public String getValue() {
//			return this.value;
//		}
//	}
//	
//this all can be minimized to this generic class Bo:


class Box<T>{
	
	
	//INSTANCE VARIABLES
	
	private T value;
	
	
	//constructor
	
	public Box(T value) {
		
		this.value = value;
		
	}
	
	//getter method
	
	public T getValue() {
		return this.value;
	}
	
}
	
public class GenericClassExample {

	public static void main(String[] args) {
		
		
		
//		IntBox intBox =  new IntBox(20);
//		
//		
//		System.out.println("Printing the integer value is: " + intBox.getValue());
//		
//		
//        DoubleBox doubleBox =  new DoubleBox(20.22);
//		
//		
//		System.out.println("Printing the double value is: " + doubleBox.getValue());
//		
//		
//		 StringBox stringBox =  new StringBox("Hello Java");
//			
//			
//	     System.out.println("Printing the string value is: " + stringBox.getValue());
//		
		//with new Generic class can do this:
		
         Box<Integer> intBox =  new Box<>(20);
		
		
		System.out.println("Printing the integer value is: " + intBox.getValue());
		
		
   
        
        Box<Double> doubleBox =  new Box<>(20.22);
		
		
		System.out.println("Printing the double value is: " + doubleBox.getValue());
		
		
		
		 
		 Box<String> stringBox =  new Box<>("Hello Java");
			
			
	     System.out.println("Printing the string value is: " + stringBox.getValue());
			
		
		
	}

}



/*
 * 
 * Use of generics improves the readability if the code by accepting objects of any type T.
 * 
 * has also improved the type safety
 * 
 * improves reusability of code
 * 
 * helps to create object of any type rather than restricting to a specific type.
 * 
 * Generics are used in Java Collections
 * 
 * <> - Diamond Operator which is used to specify the type (E - element, T - Type, K- Key, V - Value, N - number)
 */
