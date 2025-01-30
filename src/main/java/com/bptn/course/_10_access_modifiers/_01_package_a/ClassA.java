package com.bptn.course._10_access_modifiers._01_package_a;

public class ClassA {
	
	//declare a private variable
	private int privateVar;
	
	
	//declare a public variable
	public int publicVar;
	
	
	//declare a default variable
	int defaultVar;
	
	//declare a protected variable
	protected int protectedVar;
	
	
	//declare a private method
	private void privateMethod() {
		System.out.println(" Private method is called");
	}
	
	

	//declare a public method
	public void publicMethod() {
		System.out.println(" Public method is called");
	}
	

	//declare a default method
	void defaultMethod() {
		System.out.println(" Default method is called");
	}
	
	

	//declare a protected method
	protected void protectedMethod() {
		System.out.println(" Protected method is called");
	}
	
	
	

	public static void main(String[] args) {
		
		
		//yes, we can access private method within the same class
		ClassA myObj = new ClassA();
		myObj.privateMethod();
		
		//yes we can access private variables within the same class
		System.out.println("Private Variable: " + myObj.privateVar);
		
		//yes we can access default methods within the same class
		myObj.defaultMethod();
		
		
		//yes we can access default variables within the same class
		System.out.println("Default Variable: " + myObj.defaultVar);
		
		//yes we can access public methods within the same class
		myObj.publicMethod();
		
		//yes we can access public variables within the same class
		System.out.println("Public Variable: " + myObj.publicVar);
		
		
		//yes we can access protected methods within the same class
		myObj.protectedMethod();
				
		//yes we can access protected variables within the same class
		System.out.println("Protected Variable: " + myObj.protectedVar);
		
				
	}

}


/*Access Modifiers - private , public , default(package private)  and protected
 */
