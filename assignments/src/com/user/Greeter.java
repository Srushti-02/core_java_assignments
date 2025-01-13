package com.user;

public class Greeter {
	protected String name;
	public Greeter(String name){
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Hello! "+name);
	}
	public void sayGoodBye() {
		System.out.println("Good Bye! "+name);
	}
}
