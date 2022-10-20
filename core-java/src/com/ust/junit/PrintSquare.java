package com.ust.junit;

public class PrintSquare {

	public int printSqure(int i) {
		return i*i;
	}
	
	public String sayHello(String name) {
		if(name==null || name.equals("")) {
			throw new IllegalArgumentException();
		}
		return "Hello "+name;
	}
}
