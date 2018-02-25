package com.developersdelicias.katas.junit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class HelloWorldTest {
	private HelloWorld helloWorld;

	@Before
	public void setUp() {
		helloWorld = new HelloWorld();
	}

	@Test
	@Parameters({"Benjamin, Hello Benjamin!", "Alonso, Hello Alonso!", "Brian, Hello Brian!"})
	public void can_say_hello_to_a_given_name(String name, String expected) {
		assertSayHelloWorksAsExpectedWith(name, expected);
	}

	@Test
	@Parameters(method = "emptyNames")
	public void can_say_hello_to_strangers(String name) {
		assertSayHelloWorksAsExpectedWith(name, "Hello Stranger!");
	}

	private void assertSayHelloWorksAsExpectedWith(String name, String expected) {
		assertEquals(expected, helloWorld.sayHello(name));
	}

	@SuppressWarnings("unused")
	private String[] emptyNames() {
		return new String[]{null, "", "       "};
	}
}