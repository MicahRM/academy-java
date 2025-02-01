package com.bptn.course._13_custom_exception._01_custom_exception3;

public class Main {

	public static void main(String[] args) {
		
		try {
            boolean isValid = EmailValidator.isValidEmail("example@gmail.com");
            if (isValid) {
                System.out.println("Email is valid");
            }
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
		
		

	}

}
