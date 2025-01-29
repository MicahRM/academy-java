package com.bptn.course._08_abstraction;

// After Java 8 interfaces support abstract, default and static methods on top of everything else before



interface Operations{
	
	
	//abstract method - no implementation -  seems like abstract is assumed in interfaces (this is why we use default methods(-iguess)
	void draw();
	
	//default method - has some implementation - seems like default word is needed to tell compiler that this method has regular behaviour(not abstract)
	default int add(int a, int b) {
		return a + b;
	}
	
	
	//static method
	static double getRandomNumber() {
		return Math.random();
	}
	
}


//Sub Class that implements the interface
class Calculator implements Operations{

	
	//compiler always enforces the subclass to implement the abstract methods from the interface
	@Override
	public void draw() {
		System.out.println("Draw method has been implemented");
		
	}
	
}

public class Abstraction3 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		c1.draw();
		
		int result = c1.add(2, 3);
		
		System.out.println("The result is: " + result);
		
		System.out.println("The random number is: " + Operations.getRandomNumber());

	}

}


// Major key takeaways
/*
 * interface cannot be instantiated
 * After Java 8, interfaces consist of abstract methods, default methods and static methods
 * Interfaces support multiple inheritance which means that a subclass can have multiple superclasses
 * interfaces cannot have instance variables
 * interface cannot have instance variables
 * interface cannot have instructors
 * interface can consist of constatnts
 * 
 * 
 * Functional interfaces - comes with only 1 single abstract method(SAM)
 */
