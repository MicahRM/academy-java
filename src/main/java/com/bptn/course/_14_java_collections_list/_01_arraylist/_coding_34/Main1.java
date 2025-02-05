package com.bptn.course._14_java_collections_list._01_arraylist._coding_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {  //straight forward approach to convert ArrayList to Array

	public static void main(String[] args) {
		
		
		  List<String> nameList = new ArrayList<String>();

	       nameList.add("Robert");
	       nameList.add("Samson");
	       nameList.add("Alex");
	       nameList.add("William");
	       
	       System.out.println("Elements of List: " + nameList);
	       
	       String[] output = new String[nameList.size()];
	       
	       output = nameList.toArray(output);
	       
	       
	       //print all the elements of the array
	       
	       System.out.println("Elements of array; " + Arrays.toString(output));

	}

}
