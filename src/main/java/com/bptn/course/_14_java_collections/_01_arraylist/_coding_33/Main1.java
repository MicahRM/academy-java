package com.bptn.course._14_java_collections._01_arraylist._coding_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 { //shorter way to convert an Array to ArrayList without using for loops

	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "Honda", "Ford"};
		
		List<String> newList = new ArrayList<>(Arrays.asList(cars));
		
		System.out.println(newList);
				
	}

}
