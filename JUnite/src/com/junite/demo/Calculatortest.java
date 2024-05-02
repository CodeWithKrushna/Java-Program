package com.junite.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest {
	 Calculator cal;

	@Before
	public void setUp() throws Exception {
		 cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(7, cal.add(4, 3));
		
		assertEquals(2, cal.sub(4, 2));
		
		assertEquals(10, cal.multi(5, 2));
		
		assertEquals(3, cal.div(6, 2));
		
	}
	
	/*@Test
	public void test1() {
	
		assertEquals(7, cal.add(5, 3));
	*/

}
