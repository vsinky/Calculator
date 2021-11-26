package com.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class JUnit4AssertionTest {

	@Test
	public void testAssert() {
		String string1 = new String ("Sinky");
		String string2 = "Sinky";
		Object obj1 = new Object();
		Object obj2 = new  Object();
		
		assertEquals(string1,string2);
		//assertSame(string1,string2);
		//assertSame(obj1,obj2);
		assertNotSame(obj1,obj2);
	}
}
