package com.cloudreach.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.cloudreach.demo.Calculator;

class CalculatorTest {
	
	private  Calculator objCalcTest;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		objCalcTest = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	

	@Test
	final void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = objCalcTest.add(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	final void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = objCalcTest.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	final void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = objCalcTest.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	final void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = objCalcTest.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
	}
  
}
