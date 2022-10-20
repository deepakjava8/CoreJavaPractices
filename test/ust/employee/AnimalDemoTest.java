package com.ust.employee;


public class AnimalDemoTest {
	String color="White";
}

class Cow extends AnimalDemoTest{
	String color="Black";
	void printColor(){  
		System.out.println(color); //prints color of Dog class  
		System.out.println(super.color); //prints color of Animal class  
	}  
}

