package com.junit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS) //only 1 object for all the test
class JunitTest2 {
	Junit2 obj = new Junit2();
	
	
	@BeforeAll
	public void startAll()
	{
		System.out.println("Before All");
	}
	
	@AfterAll
	public void endAll()
	{
		System.out.println("After All");
	}
	
	@AfterEach
	public void end()
	{
		System.out.println("After Each");
	}
	
	@BeforeEach
	public void start()
	{
		System.out.println("Before Each");
	}
	
	@Test
	void multiplyTest() {
//		fail("Not yet implemented");
		
		double actual = obj.multiply(13.4, 18.9);
		double expected = 87.67;
		assertEquals(actual, expected);
	}
	
	@Test
	void multiplyTest2() {
//		fail("Not yet implemented");
//		Junit2 obj = new Junit2();
		double actual = obj.multiply(15.0, 3.0);
		double expected = 45.0;
		assertEquals(actual, expected);
	}
	@Test
	void returnNaturalNumberTest() {
//		fail("Not yet implemented");
//		Junit2 obj = new Junit2();
//		double actual = obj.multiply(2.0, 2.0);
//		double expected = 4.0;
		try {
		int [] arr = null;
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
//		assertArrayEquals(expected, obj.returnNaturalNumber(5));
	}
	@Test
	void multiplyTest4() {
//		fail("Not yet implemented");
		
		assertTrue(obj.isOdd(4));
	}
	

}
