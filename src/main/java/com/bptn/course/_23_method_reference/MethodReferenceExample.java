package com.bptn.course._23_method_reference;



@FunctionalInterface
interface JavaInterface{
	
	
	//SAM - Single Abstract Method
	
	int findMax(int a, int b);
	
}


//traditional implementation of an interface

//class B implements JavaInterface{
//
//	@Override
//	public int findMax(int a, int b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}



public class MethodReferenceExample {

	public static void main(String[] args) {
		
		
		//implement the SAM in the interface using Lambda Expression and static Method Math.max(a,b)
		
		JavaInterface obj = (a,b) -> Math.max(a,b);
		
		obj.findMax(2, 3);
		
		System.out.println(obj.findMax(2,3));
			
			
	  //Another way to implement it could be Method Reference - ClassName :: staticMethodName
		
		
		JavaInterface obj1 = Math :: max;
		
		System.out.println(obj1.findMax(4,5));;
		

	}

}
