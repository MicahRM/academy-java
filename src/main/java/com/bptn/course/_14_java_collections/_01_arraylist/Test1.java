package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();   //ArrayList created
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};   //array created
        for (int i = 0; i < friends.length; i++) {   //for loop to traverse array
            names.add(friends[i]);                   //add corresponding array values to ArrayList based on matching indices
        }
        System.out.println(names);   //print new ArrayList
		

	}

}
