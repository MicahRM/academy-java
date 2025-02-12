package com.bptn.course._18_java_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator calculator =  new Calculator();
	
	@Test
	public void testAdd() {
		
		assertEquals( 5,  calculator.add(2, 3));
		
		assertEquals( -1,  calculator.add(-2, 1));
		
	}
	
	
	@Test
	public void testSubtract() {
		
		assertEquals( 5,  calculator.sub(10, 5));
		
		assertEquals( -3,  calculator.sub(-2, 1));
		
	}
	
	
	@Test
	public void testMultiply() {
		
		assertEquals( 50,  calculator.multiply(10, 5));
		
		assertEquals( -2,  calculator.multiply(-2, 1));
		
	}
	



}
