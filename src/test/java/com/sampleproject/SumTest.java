package com.sampleproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Sum s=new Sum();
		assertEquals(10,s.add(4,6));
	}

}
