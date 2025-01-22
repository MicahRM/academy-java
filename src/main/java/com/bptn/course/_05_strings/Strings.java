package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		
		//declare sting variable
		
		String s = "Hello World";
		
		//length of string
		
		int stringLength = s.length();
		
		System.out.println("The length of the string is: " + stringLength);
		
		//get a substring
		//substring method gets characters from beginIndex up to endIndex-1 (in the same array pattern starting from 0 index)
		//How many characters do you want to include and starting from ?
		String sub = s.substring(0, 5);
		
		System.out.println("The substring with start and end index is: " + sub);
		
		String sub1 = s.substring(5); //substring method gets characters from beginIndex until the string terminates. How many characters from the beginning do you want to remove?
		
		System.out.println("The substring with startindex is: " + sub1);
		
		//convert the string to uppercase
		
		String upperCase = s.toUpperCase();
		
		System.out.println("The uppercase form of the string is: " + upperCase);
		
	
		//convert the string to lowercase
		
		String lowerCase = s.toLowerCase();

		System.out.println("The uppercase form of the string is: " + lowerCase);
		
		//index of the string
		
		int index = s.indexOf("World");
		
		System.out.println("The index of the substrng 'World' is: " + index); //returns the beginning index of the substring inside the string. the W of World is the 6th letter in the string.
		
		int index1 = s.indexOf("Java");

		System.out.println("The index of the substrong 'Java' that does not exist is always -1: " + index1); //index of string that doesnt exist is always -1.
		
		
		//get a character at a specific index
		
		char c = s.charAt(0);
		
		System.out.println("The character at index 0 in our string is: " + c);
		
		
		//reverse a string
		
		String reversedWord = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			reversedWord += s.charAt(i);	
		
		}
		
		
		System.out.println("");
		System.out.println("The reversed word is: " + reversedWord);
		
		
		
	}
}
