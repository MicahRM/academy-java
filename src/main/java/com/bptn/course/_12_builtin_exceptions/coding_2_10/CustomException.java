package com.bptn.course._12_builtin_exceptions.coding_2_10;

import java.util.Scanner;

public class CustomException {
	
	public static void validateFileExtension(String fileName) throws FileExtensionException {
		
		if(!fileName.endsWith(".txt")) {
			
			throw new FileExtensionException("File doesn't have .txt extension");
			
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the file name with correct extension i.e. .txt");
		
		
		try {
			String fileName = scanner.nextLine();
			
			validateFileExtension(fileName);
			
			if(fileName.endsWith(".txt")) {
				System.out.println("Correct file name with extension .txt");
			}
			
		} catch (FileExtensionException e) {
			System.out.println("Error: " + e.getMessage());
			// TODO: handle exception
		}finally {
			scanner.close();
			
		}
		
	
		// TODO Auto-generated method stub

	}

}
