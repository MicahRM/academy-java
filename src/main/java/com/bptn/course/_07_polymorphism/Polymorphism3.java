package com.bptn.course._07_polymorphism;

public class Polymorphism3 {
	
	
	
	void print(int integer) {
		
		
		System.out.println("Printing an integer: " + integer);
	}
	
	void print(String s) {
		
		
		System.out.println("Printing a String: " + s);
	}
	
	
	int print(int a, int b) {
		
		return a + b;
		
	}
	
	
	double print(double a, double b) {
		
		return a + b;
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Polymorphism3 p1 = new Polymorphism3();
		
		p1.print(5);
	
		
		p1.print("Hello World");
		
		
		System.out.println("The sum of two integers is: " + p1.print(5,4));
		
		System.out.println("The sum of two double values is: " + p1.print(2.0, 3.0));
		
	}

}


//Major key takeaways
/* Method overloading - compile time polymprphism
 * 1. Method overloading happens within the same class and no inheritance is required
 * 2. Method names should be the same.
 * 3. It can have different return type and number of parameters can be different from method to method.
 * 4. It can have different types of parameters.
 * 5. static methods can actually be overloaded because they belong to the class.
 * 
 * 
 * 
 */
