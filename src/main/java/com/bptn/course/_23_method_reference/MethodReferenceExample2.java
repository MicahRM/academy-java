package com.bptn.course._23_method_reference;


@FunctionalInterface
interface A{
	
	
	//SAM - Single Abstract Method
	
	void showInterfaceInfo(String message);
	
}

public class MethodReferenceExample2 {
	
	//static method
	public static void show(String message) {
		
		System.out.println(message);
		
		
		
	}

	public static void main(String[] args) {
		
		//Lambda implementation
		
		A obj = (message) -> System.out.println(message);
		
		//or
		
		
		A obj1 = (message) -> MethodReferenceExample2.show(message); //using static method show
		
		obj.showInterfaceInfo("Hello World");
		
		
		//using Method Reference to static method - ClassName :: staticMethodName
		
		A obj2 = MethodReferenceExample2 :: show;
		
		obj2.showInterfaceInfo("Hello Java");
		
		
		

	}

}
