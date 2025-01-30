package com.bptn.course._10_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA myObj = new ClassA();
		

		//No, we can not access private method within a different class of the same package
		//myObj.privateMethod();
		
		//No, we can not access private variables within a different class of the same package
		//System.out.println("Private Variable: " + myObj.privateVar);
		
		//yes, we can access default method within a different class of the same package
	    myObj.defaultMethod();
				
		//yes, we can access default variables within a different class of the same package
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



/*Major Key Takeaways
 * 
 * 1. We cannot access private variables or methods from a different class which exists in the same package.
 * 
 * 2. we can access default variables or methods from different classes that exist in the same package.
 * 
 */
 
