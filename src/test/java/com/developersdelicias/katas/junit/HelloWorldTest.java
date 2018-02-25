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

	@Test(expected = MalformedNameException.class)
	@Parameters({"Benjamin1", "Alonso33", "123Juan", "$Pedro"})
	public void cannot_say_hello_to_malformed_names(String name) {
		sayHello(name);
	}

	private void assertSayHelloWorksAsExpectedWith(String name, String expected) {
		assertEquals(expected, sayHello(name));
	}

	private String sayHello(String name) {
		return helloWorld.sayHello(name);
	}

	@SuppressWarnings("unused")
	private String[] emptyNames() {
		return new String[]{null, "", "       "};
	}
}