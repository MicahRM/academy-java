package com.bptn.course._14_java_collections_list._01_arraylist;

import java.util.ArrayList;

public class RemoveLongStrings {
	
	public static void removeLongStrings(ArrayList<String> list) {
        //code here

        for(int i = 0; i<list.size(); i++){   //for loop to iterate ArrayList
            if(list.get(i).length() >4){       //checks if each element has a length over 4
                list.remove(i);                //removes the elements that satisfy the condition
                
                
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }

}
