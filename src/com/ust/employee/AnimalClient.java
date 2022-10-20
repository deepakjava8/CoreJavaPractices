package com.ust.employee;


class Animal1 {
	String color="White";
}

class Dog extends Animal1{
	String color="Red";
	void printColor(){  
		System.out.println(color); //prints color of Dog class  
		System.out.println(super.color); //prints color of Animal class  
	}  
}
public class AnimalClient {
public static void main(String[] args) {
	Dog d=new Dog();
	d.printColor();
}
}
