package com.eviac.blog.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greet;

	@Before
	public void setup() {
		System.out.println("setup");
		greet = new GreetingImpl();
	}

	@Test
	public void greetingShouldReturnValidOutput() {
		System.out.println("greetingShouldReturnValidOutput");
		String result = greet.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetingShouldThrowExceptionOnNullValue() {
		System.out.println("greetingShouldThrowExceptionOnNullValue");
		greet.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetingShouldThrowExceptionOnEmptyValue() {
		System.out.println("greetingShouldThrowExceptionOnEmptyValue");
		greet.greet("");
	}

	@After
	public void teardown() {
		System.out.println("teardown");
		greet = null;
	}
}
