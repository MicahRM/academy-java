package com.bptn.course;

public class Vday {

	    public static void main(String[] args) {
	        // Print the heart shape
	        for (double y = 1.5; y > -1.5; y -= 0.1) {
	            for (double x = -1.5; x < 1.5; x += 0.05) {
	                double a = x * x + y * y - 1;
	                System.out.print(a * a * a - x * x * y * y * y <= 0 ? "💖" : "  ");
	            }
	            System.out.println();
	        }

	        // Print the Valentine's Day message
	        System.out.println("\nHappy Valentine's Day! 💖");
	    }
	}


