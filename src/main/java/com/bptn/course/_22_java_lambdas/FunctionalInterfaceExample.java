package com.bptn.course._22_java_lambdas;


@FunctionalInterface
interface A{
	
	void show();
	
	
	//default and static methods
}


@FunctionalInterface
interface C{
	
	String display(String name);
	
	
	//default and static methods
}

class B implements A{

	@Override
	public void show() {
		
		
		System.out.println("Hello World");
		
		
	}
	
	
}

//
//class D implements C{
//
//	@Override
//	public String display(String name) {
//		
//		return name;
//		
//		
//	}
//	
//	
//}

public class FunctionalInterfaceExample {
	
	
	public static void main(String[] args) {
		
		
		A myObj = new B();  //the common way to use functional interfaces 
		myObj.show();
		
		A myObj1 = new A(){
			
			public void show() {
				System.out.println("Hello World");
			}
		}; //implementing A using an anonymous inner class, this is another way 
		
		
         A myObj2 = () -> System.out.println("Hello World");
         
         A myObj3 = () -> System.out.println("Hello Java");
         
         myObj2 = () -> System.out.println("can reassign like this too");
		
		myObj2.show();  //implementing A using a lambda expression, this is another way 
		                    //lambda expression - shorthand syntax of implementing an interface to use the abstract method
			
			
		C myObj4 = new C(){
				
			public String display(String name) {
					
				return " Hello JAVA" + name;
					
			}
		}; //implementing C using an anonymous inner class, this is another way 
		
		 C myObj5 = (name) ->  "Hello Java" + name;  //implementing C using a lambda expression, this is another way 
                                                     //lambda expression - shorthand syntax of implementing an interface to use the abstract method
			                                         //WITHOUT return keyword the compiler throws now error because it knows what is being returned.
		System.out.println(myObj5.display("Micah"));  //if we have multiple lines of code to implement within the SAM we use curly brackets () -> {code}
		                                                 //the input parameter type may or may not be mentioned - is not mandatory
			                                              //the implementation of the method (SAM) should follow the same return type as however it is defined in the FunctionalInterface
			
		

	}
}

/*
 * Interface with single abstract method(SAM)
 * 
 * It can have default and static methods and methods from Object superclass(toString, equals)
 * 
 * lambda expression is a simple, shorthand syntax to implement SAM of functional interface without having to create a class just to implement SAM.
 * 
 *A functional interface has @FunctionalInterface annotation
 * 
 * Lambda expressions is just a way to implement Single Abstract Methods (SAM) within an interface
 * 
 * 
 */
 


