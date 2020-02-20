package com.app.Final;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;



public class CalTest {

	Cal c = new Cal();
	
	@Test
	public void testAdd()
	{
		assertEquals(5,c.add(2,3));
	}
	
	@Test
	public void testsub()
	{
		assertEquals(6,c.sub(8, 2));
		assertEquals(3,c.sub(4,1));
	}
	
	@Test
	public void testmul()
	{
		assertEquals(6,c.mul(2,3));
	}
	
	@Test
	public void testdiv()
	{
		assertEquals(2,c.div(12,6));
	}
	

}
