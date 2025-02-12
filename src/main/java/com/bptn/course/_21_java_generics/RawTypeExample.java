package com.bptn.course._21_java_generics;

//import java.util.ArrayList;



class RawBox<T>{
	
	//instance variables
	
	private T value;
	
	
	///constructor
	///
	
	public RawBox(T value) {
		
		this.value=value;
	}
	
	
	//getter
	public T getBox() {
		return this.value;
	}
}



public class RawTypeExample {

	public static void main(String[] args) {
		
		//ArrayList arrayList = new ArrayList(); //raw type created throws warning instead of exception, code still runs	

		
		//create an object raw type from RawBox
		
		 RawBox rawBox = new RawBox(20);  //if you specify the type here and don't just use default Object, it will show you the compilation error before runtime execution
		
		 RawBox<Integer> rawBox1 = new RawBox<>(20);
		 
		 Integer obj1 = rawBox1.getBox();
		 
	     Object obj = rawBox.getBox();   //although an int is passed, must return an  object because the type is never specified
	     
	     //obj.toString can work as well
	     
	     String str = (String) obj;   //can typecast this object to a String, this will cause an error at Runtime, unchecked exception(crashes program)
		
	     System.out.println(obj1);
	}

}


/*Using raw types should be avoided if possible because it disables checking errors during compilation time and leads to potential issues during Runtime
 * 
 * using parameterized type ensures type checking during compilation (RawBox<Integer> rawBox = new RawBok(20); , Integer obj = rawBox.getBox();
 * 
 * when creating objects, you should always specify the type.
 * 
 */
