package com.demo;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator calculator;
	//@Before //run before each test case
	//public void init() {
		//System.out.println("Init before each test case");
	//	calculator =new Calculator();
	//}
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Init once while invoke first test case of class");
		calculator = new Calculator();
	}
	
	@Test //By using this annotation method convert to junit test case
   // @Test(timeout=1000)
	//@Test(expected = Exception.class)
	public void test_addtwonumber_should_return_sum() throws Exception {
		
		Calculator calculator = new Calculator();
		int result = calculator.add(10,10);
		int expectedResult = 20;
		
		assertEquals(expectedResult, result);
		//throw new Exception();
		
	}
	
	@Test
	public void test_addtwodublenumber_should_return_sum() throws Exception {
		
	//	Calculator calculator = new Calculator();
		int result = calculator.add(0,0);
		int expectedResult = 20;
		
		
		assertEquals(expectedResult, result);	
	}
	
	@AfterClass
	public static void endtask() {
		System.out.println("Ending task");
	}
}
