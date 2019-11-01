package com.myproject.blah;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleClassTest {

	@Test
	public void test() {
		String actual = SimpleClass.blah();
		assertEquals("test", actual);
		
	}

}
