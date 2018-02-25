package com.developersdelicias.katas.junit;

public class HelloWorld {

	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();

		String name = "Benjamin";
		String result = helloWorld.sayHello(name);

		System.out.println(result);
		System.out.println(helloWorld.sayHello("Alonso"));
	}
}
