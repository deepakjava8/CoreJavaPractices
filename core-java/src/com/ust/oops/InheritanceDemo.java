package com.ust.oops;

class Parent{
	int x=10;
	String name;
}
class Child extends Parent{
	int y=20;
	public void m1() {
		System.out.println("Parent : "+x);
		System.out.println("Child : "+y);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Child c1=new Child();
		c1.m1();
	}
}
