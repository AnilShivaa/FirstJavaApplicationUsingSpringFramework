package com.anil.beans;

public class WelcomeGreetings {
	
	static {
		System.out.println("WelcomeGreetings.static block()"); //to check class is loaded
	}
	
	public WelcomeGreetings() { //to check object is created
		System.out.println("WelcomeGreetings::0-param constructor");
	}
	
	public String welcome(String user) {
		return "Welcome to String"+user;
	}
}
