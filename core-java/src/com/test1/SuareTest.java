package com.test1;

public class SuareTest {
	public int sqare(int x) {
		return x*x;
	}
	
	public String sayHello(String name) {
		if(name == null || name.length()==0) {
			throw new IllegalArgumentException();
		}
		return "Hello "+name;
	}
}
