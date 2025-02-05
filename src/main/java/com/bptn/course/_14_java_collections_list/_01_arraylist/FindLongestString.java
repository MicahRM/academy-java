package com.bptn.course._14_java_collections_list._01_arraylist;

import java.util.ArrayList;

public class FindLongestString {
	
	public static String findLongest(ArrayList<String> list){

        String longestWord = " ";  //declare empty String

        for(String string: list){  //for each loop to iterate all strings in the ArrayList
            if(string.length() > longestWord.length()){  //Checks if the each string has a greater length than the longestWord length
                longestWord = string;   //sets the longestWord value to any strung found that is longer than the current longestWord
            }
        }
        //code here
        return longestWord; //returns the derived longestWord
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
        
        
        //to move to front
        String longestString = findLongest(values);
        values.remove(longestString);
        values.add(0,longestString);
        
    }

}


/*
 *  longestWord=""  create an emoty string to store the longest word.
 *  
 *   words[0] = 'singapore' this becomes original value for longestWord.
 *   
 *   if(longestWord length > firstWord length)
 *   update longestWord = "singapore"
 *   
 *   
 *   
 *   if(longestWord length > secondWord length)
 *   words[1] = 'cattle'
 *   update longestWord = "singapore"
 *   
 *   if(longestWord length > thirdWord length)
 *   words[2] = 'metropolitan'
 *   update longestWord = "metropolitan"
 *   
 *   if(longestWord length > fourthWord length)
 *   words[3] = 'turnstile'
 *   update longestWord = "metropolitan"
 *   
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
