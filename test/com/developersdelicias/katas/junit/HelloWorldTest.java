package com.developersdelicias.katas.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	private HelloWorld helloWorld;

	@BeforeClass
	public static void setUpOnce() {
		System.out.println("*** Setup once for all tests");
	}
	@Before
	public void setUp() {
		System.out.println("+++ Setup before each test");
		helloWorld = new HelloWorld();
	}

	@Test
	public void can_say_hello_to_a_given_name() {
		System.out.println("Testing normal names scenarios");
		assertEquals("Hello Benjamin!", helloWorld.sayHello("Benjamin"));
		assertEquals("Hello Alonso!", helloWorld.sayHello("Alonso"));
	}

	@Test
	public void can_say_hello_to_strangers() {
		System.out.println("Testing empty names scenarios");
		assertEquals("Hello Stranger!", helloWorld.sayHello(null));
		assertEquals("Hello Stranger!", helloWorld.sayHello(""));
		assertEquals("Hello Stranger!", helloWorld.sayHello("     "));
	}

	@After
	public void tearDown() {
		System.out.println("--- Tear down after each test");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("@@@ Tear down all tests");
	}
}