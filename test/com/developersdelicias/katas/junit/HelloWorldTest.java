package com.developersdelicias.katas.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

	@Test
	public void can_say_hello_to_a_given_name() {
		HelloWorld helloWorld = new HelloWorld();

		String name = "Benjamin";
		String expected = "Hello Benjamin!";
		String result = helloWorld.sayHello(name);

		assertEquals(expected, result);
	}
}