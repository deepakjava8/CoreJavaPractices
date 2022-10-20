package com.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareJunitTest {

	@Test
	public void test() {
		SuareTest t=new SuareTest();
		int result = t.sqare(4);
		assertEquals(16, result);
		assertNotNull(result);
	}
	
	@Test
	public void testSayHello() {
		SuareTest t=new SuareTest();
		String result = t.sayHello("Amit");
		assertEquals("Hello Amit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSayHello_shouldThrowAnException_ForNameIsNull() {
		SuareTest t=new SuareTest();
		t.sayHello(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSayHello_shouldThrowAnException_ForNameIsBlank() {
		SuareTest t=new SuareTest();
		t.sayHello("");
	}

}
