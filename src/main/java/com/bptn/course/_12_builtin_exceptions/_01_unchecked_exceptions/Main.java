package com.bptn.course._12_builtin_exceptions._01_unchecked_exceptions;

public class Main {
	
	
	//method to demonstrate exception propagation
	public void method1() {
		int[] arr = {1,2,3,4};
		System.out.println(arr[5]); //critical statement
	}
	
	
	
	//method to handle exception and demonstrate propagation
	public void method2() {
	
		try {
			method1();		
	}catch (ArrayIndexOutOfBoundsException e) {
		
		System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
	}
		
	}
	
	
	

	public static void main(String args[]) {
		
		Main exceptionSolutionObject = new Main();
		exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
	}

}
