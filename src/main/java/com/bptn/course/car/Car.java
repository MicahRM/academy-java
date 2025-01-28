package com.bptn.course.car;

public class Car {
	
	String color;
	String brand;
	int price;
	

    // Fill in the code for Step 3


      /*public Car(String color, String brand, int price) {
        // Fill in the code for Step 4

      }
      */
      


      Car(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}




	void printCarDetails() {
          System.out.println("Car{" +
                  "color='" + this.color + '\'' +
                  ", brand='" + this.brand + '\'' +
                  ", price=" + this.price +
                  '}');
    }
	
	
	/*   // also a possibility - using 'this' to invoke the current class method.
	 * 
	void printCarDetails {
        this.print();
    }

    void print(){
        System.out.println("Car{" +
               "color='" + color + ''' +
               ", brand='" + brand + ''' +
               ", price=" + price +
               '}');
    }

*/
    // Fill in the code
    // private void print() {
    //     // fill in code
		

	}

