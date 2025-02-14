package com.bptn.course._22_java_lambdas;



@FunctionalInterface
interface Calculator{
	
	
	//abstract method - method with no implementation, each interface can only have one
	
	int calculate(int a, int b);
	
	
	//default and static methods
	default void displayResult(int result) {
		
		System.out.println("Result: " + result);
	}
	
	
	
	
	//static methods
	//inherited methods from Object superclass - toString, equals etc.
}

public class CalculatorExample {

	public static void main(String[] args) {
		
		//use lambda expression to implement SAM from the functional interface in different ways
		
		Calculator addition = (a,b) ->a+b;   //first way to implement SAM addition 
		
		Calculator subtraction = (a,b) ->a-b; //subtraction
		
		Calculator multiplication = (a,b) ->a*b; //multipication
		
		int result1 =  addition.calculate(2, 3);
		
		int result2 =  subtraction.calculate(4,2);
		
		int result3 =  multiplication.calculate(10,2);
		
		//can be used if you do not want to use default methods displayResult()
		System.out.println("Addition result " + result1 + "Subtraction result " + result2 +"Multiplication result " + result3);

		
		
		//this uses the default method displayMethod()
		addition.displayResult(result1);
		subtraction.displayResult(result2);
		multiplication.displayResult(result3);
		
		
	}

}


/*
 * we can have multiple implementations of SAM from functional interface using lambda expression
 * 
 * can also use the default methods within an interface by using the classes created using lambda
 * 
 * 
 * Lambda expressions is just a way to implement Single Abstract Methods (SAM) within an interface
 * 
 * 
 */






