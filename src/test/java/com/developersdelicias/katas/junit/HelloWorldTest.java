package com.developersdelicias.katas.junit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class HelloWorldTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
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

	@Test
	@Parameters(method = "malformedNamesAndExpectedMessages")
	public void informs_when_a_name_is_malformed(String name, String expectedMessage) {
		expectedException.expect(MalformedNameException.class);
		expectedException.expectMessage(is(expectedMessage));

		sayHello(name);
	}

	@SuppressWarnings("unused")
	private String[][] malformedNamesAndExpectedMessages() {
		return new String[][]{
				new String[]{"Benjamin1", "Benjamin1 is not a valid name"},
				new String[]{"Alonso234", "Alonso234 is not a valid name"},
				new String[]{"JorgeX", "JorgeX is not a valid name"},
		};
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