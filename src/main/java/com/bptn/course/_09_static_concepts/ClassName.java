package com.bptn.course._09_static_concepts;

public class ClassName {

	// declare a static variable
	static int staticVariable = 100;

	// declare instance variable
	int instanceVariable;

	// declare static method
	static void staticMethod() {
		System.out.println("static method is called");

		// can i access an instance variable directly within a static method? NO!
		// instanceVariable = 100;

		// can i access instance method within a static method? NO!
		// instanceMethod();

		// static method cannot directly access the instance methods or variables except
		// through an instantiated object.
		//ClassName myObj = new ClassName();
		//myObj.instanceMethod();

	}

	// declare instance method
	void instanceMethod() {

		System.out.println("Instance method is called");

		// can i access static variable within and instance method? YES!
		System.out.println("Static variable:  " + staticVariable);

		// can i access static method within an instance method? YES!
		staticMethod();
	}

	public static void main(String[] args) { // static method cannot directly access the instance mthods or variables
												// except through an instantiated object.

		// static method cannot directly access the instance methods or variables except
		// through an instantiated object.
		ClassName myObj = new ClassName();
		myObj.instanceMethod();

		// static methods can directly access static variables and methods like this:
		System.out.println("Static Variable: " + ClassName.staticVariable);
		ClassName.staticMethod();

	}

}

//Major Key Takeaways
/*
 * Can we DIRECTLY access instance variables or methods directly in a static method such as the main method? NO!
 * 
 * Can we DIRECTLY access instance variable or method within a static method by creating
 * and object and then accessing the instance variable or method? YES! 
 * 
 * Can we DIRECTLY access static variables or methods within a main method? YES!
 * 
 * Can we Directly access static variables and methods within an instance method? YES!
 * 
 * 
 */
