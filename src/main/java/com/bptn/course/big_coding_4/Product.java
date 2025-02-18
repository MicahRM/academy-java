package com.bptn.course.big_coding_4;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	 // Create your instance variables
	
	private int id;
	private String name;
	private double price;

    // Create a constructor to initialize the product properties
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

    // Create a static method "countProducts"
	
	public static long countProducts(List<Product> list) {
		
            return list.stream()
				       .filter((element) -> element.price <30000)  //converts the given list to a stream, then filters all elements with a price below 30,000 and prints them
				       .count();
		
	}
    
    // Filter products based on the price and get the count of products

    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<Product>();

        // Add products to the list
        
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000)); //adds Product objects to the product list
       

        // Call "countProducts" method and hold return type in "count" variable 
        
        long count = countProducts(productsList); //counts the products that adhere to the above condition
        
       
        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }

	
}


/*
 * Summary:
 * 
 * Create your instance variables
 *  Create a constructor to initialize the product properties
 * Create a static method "countProducts"
 * converts the given list to a stream, then filters all elements with a price below 30,000 and prints them
 * Filter products based on the price and get the count of products
 * Create a list of products
 *  Add products to the list
 * adds Product objects to the product list
 *  Call "countProducts" method and hold return type in "count" variable 
 * counts the products that adhere to the above condition
 * Print the count of products whose price is less than 30000
 *  
 * 
 */
