package com.ust.java8;

@FunctionalInterface
interface MyFunctionalF1{
	public void m1();
}
public class FunctionalInterfaceDemo {
public static void main(String[] args) {
	MyFunctionalF1 f=()->System.out.println("My Message");
	f.m1();
}
}
