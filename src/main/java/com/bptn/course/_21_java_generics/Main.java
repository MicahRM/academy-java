package com.bptn.course._21_java_generics;

import java.util.ArrayList;
import java.util.List;

public class Main<T extends Number> {
	
	 private List<T> list = new ArrayList<>();  //list as instance variable

	    public void add(T num) {   //T is bounded to accept T extends Number
	        list.add(num);
	    }
	    
	    

	    public T get(int index) {  //access the element using the get method
	        return list.get(index);
	    }

	    public double sum() {  //method to calculate sum
	        double sum = 0;
	        for (T number : list) {
	            sum += number.doubleValue();
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Main<Integer> intList = new Main<>();  //create an object of the Main class to accept Integers (MUST specify type in object creation to avoid runtime errors)
	        intList.add(1);
	        intList.add(2);
	        intList.add(3);

	        System.out.println("Integer List:");
	        for (int i = 0; i < intList.list.size(); i++) {
	            System.out.println(intList.get(i));
	        }
	        System.out.println("Integer List Sum = " + intList.sum());

	        Main<Double> doubleList = new Main<>();
	        doubleList.add(1.1);
	        doubleList.add(2.2);
	        doubleList.add(3.3);

	        System.out.println("\nDouble List:");
	        for (int i = 0; i < doubleList.list.size(); i++) {
	            System.out.println(doubleList.get(i));
	        }
	        System.out.println("Double List Sum = " + doubleList.sum());
	        
	        
	        Main<Number> numList = new Main<>();
	        numList.add(1.1);
	        numList.add(2.2);
	        numList.add(3.3);
	        numList.add(1);
	        numList.add(2);
	        numList.add(3);

	         System.out.println("\nNumber List:");
	        for (int i = 0; i < numList.list.size(); i++) {
	            System.out.println(numList.get(i));
	        }
	        System.out.println("Number List Sum = " + numList.sum());
	   

	    }

}
