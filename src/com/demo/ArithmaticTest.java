package com.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmaticTest {
	private static Calculator calculator;
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	
	@BeforeClass
	public static void init() {
		calculator = new Calculator();
	}
	@Parameterized.Parameters
	public static Collection<Object> input(){
		return Arrays.asList(new Object[][] {
			{1,2,3},
			{11,22,33},
			{111,222,333},
			{10,9,19}
			});
	}
	
	@Test
	public void testAirthematicTest() {
		System.out.println("Sum of Numbers :  "+ expectedResult);
		Calculator calculator =new Calculator();
		int actualResult = calculator.add(firstNumber, secondNumber);
		assertEquals(expectedResult,actualResult);
	}
	

	
	
	
}
