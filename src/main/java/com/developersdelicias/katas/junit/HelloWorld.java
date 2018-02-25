package com.developersdelicias.katas.junit;

public class HelloWorld {

	public String sayHello(final String name) {
		if (isStranger(name))
			return "Hello Stranger!";

		if (isMalformed(name))
			throw new MalformedNameException();

		return "Hello " + name + "!";
	}

	private boolean isMalformed(String name) {
		return !name.matches("[A-Z][a-z]+");
	}

	private boolean isStranger(String name) {
		return name == null || name.trim().isEmpty();
	}
}
