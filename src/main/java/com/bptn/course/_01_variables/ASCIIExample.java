package com.bptn.course._01_variables;

public class ASCIIExample {

	public static void main(String[] args) {
		
		
		//step 1: create a char variable and assign it any char value
		
		 char c = 'B';
		 
		//step 2: assign the character to an int variable to ge ther ASCII value of the char.
		  
		 int ascii = c;
		 
		 //step 3: print this output 
		 
		 System.out.println("The ASCII value of " + c + " is: " + ascii);

		
	}

}

/*public class ASCIIExample {
    public static void main(String[] args) {
        char b = 'B';
        int ascii = b;
        System.out.println("The ASCII value of " + b + " is: " + ascii);

        char nextChar = (char) (b + 1);
        System.out.println("The character after " + b + " is: " + nextChar);
    }
}*/