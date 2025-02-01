package com.bptn.course._13_custom_exception._01_custom_exception3;

public class EmailValidator {
	
	public static boolean isValidEmail(String email) throws InvalidEmailException {
	    String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";  //regex
	    if(email.matches(pattern))
	      return true;
	    else
	      throw new InvalidEmailException("Invalid email address format.");
	  }

}
