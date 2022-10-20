package com.ust.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintSquareTest {

	@Test
	public void testPrintSqure() {
		PrintSquare ps=new PrintSquare();
		int result = ps.printSqure(4);
		assertEquals(16, result);
	}
	
	@Test()
	public void testSayHello() {
		PrintSquare ps=new PrintSquare();
		String result = ps.sayHello("Deepak");
		assertEquals("Hello Deepak", result);
		assertNotNull(result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSayHello_for_nullCheck() {
		PrintSquare ps=new PrintSquare();
		ps.sayHello(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSayHello_for_blankCheck() {
		PrintSquare ps=new PrintSquare();
		ps.sayHello("");
	}

}
