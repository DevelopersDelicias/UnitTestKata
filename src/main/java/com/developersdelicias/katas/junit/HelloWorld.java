package com.developersdelicias.katas.junit;

public class HelloWorld {

	public String sayHello(final String name) {
		if (name == null || name.trim().isEmpty())
			return "Hello Stranger!";

		return "Hello " + name + "!";
	}
}
