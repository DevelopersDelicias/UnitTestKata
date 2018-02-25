package com.developersdelicias.katas.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	@Test
	public void can_say_hello_to_a_given_name() {
		HelloWorld helloWorld = new HelloWorld();

		assertEquals("Hello Benjamin!", helloWorld.sayHello("Benjamin"));
		assertEquals("Hello Alonso!", helloWorld.sayHello("Alonso"));
	}


	@Test
	public void can_say_hello_to_strangers() {
		HelloWorld helloWorld = new HelloWorld();

		assertEquals("Hello Stranger!", helloWorld.sayHello(null));
		assertEquals("Hello Stranger!", helloWorld.sayHello(""));
		assertEquals("Hello Stranger!", helloWorld.sayHello("     "));
	}
}