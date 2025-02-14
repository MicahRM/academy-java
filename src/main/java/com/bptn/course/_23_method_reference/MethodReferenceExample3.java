package com.bptn.course._23_method_reference;



@FunctionalInterface
interface B{
	
	
	//SAM - Single Abstract Method
	
	void showInterfaceInfo(String message);
	
}

public class MethodReferenceExample3 {
	
	
	//instance method
		public  void show(String message) {
			
			System.out.println(message);
		
		}

	public static void main(String[] args) {
		
		//create an object/instance of the class
		MethodReferenceExample3 obj = new MethodReferenceExample3();
		
		
		//use Lambda expression by calling instance.instanceMethodName()
		B myObj = (message) -> obj.show(message);
		
		myObj.showInterfaceInfo("Hello World");
		
		
		//Method reference - calling instance method on a particular object - objectName :: instanceMethodName
		
		B myObj1 = obj :: show;
			
		myObj1.showInterfaceInfo("Hello Java");

	}

}

/*
 * if we have a lambda expression which implements the SAM using an instance method
 * in that case we can use a method reference with syntax - objectName :: instanceMethodName
 * 
 * 
 */
