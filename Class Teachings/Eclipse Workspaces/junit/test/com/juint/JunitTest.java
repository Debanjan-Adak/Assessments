package com.juint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.Junit;

class JunitTest {
	Junit j = new Junit();

	@Test
	void test() {
		
		
//		int actual = j.add(1, 4);
//		int expected = 6;
//		assertEquals(expected, actual);
		
		assertEquals("olleh",j.rev("hllo"),"Wrong");
		
		}
		

}
