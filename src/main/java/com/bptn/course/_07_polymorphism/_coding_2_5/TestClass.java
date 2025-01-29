package com.bptn.course._07_polymorphism._coding_2_5;

public class TestClass {

	public static void main(String[] args) {
		
		Car car = new Car("White", "Audi", "ChromeColored");
        car.print();

        Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
        bike.print();

	}

}
