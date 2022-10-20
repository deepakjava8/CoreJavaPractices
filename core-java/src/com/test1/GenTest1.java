package com.test1;

class Printer<T>{
	T print;
	
	public Printer(T print) {
		this.print=print;
	}
	
	public void print() {
		System.out.println(print);
	}
}
class IntegerPrinter{
	Integer printInteger;
	public IntegerPrinter(Integer printInteger ) {
		this.printInteger=printInteger;
	}
	public void print() {
		System.out.println(printInteger);
	}
}

class DoublerPrinter{
	Integer printDouble;
	public DoublerPrinter(Integer printDouble ) {
		this.printDouble=printDouble;
	}
	public void print() {
		System.out.println(printDouble);
	}
}

public class GenTest1 {
public static void main(String[] args) {
	IntegerPrinter ip=new IntegerPrinter(10);
	DoublerPrinter dp=new DoublerPrinter(111111444);
	ip.print();
	dp.print();
	
	Printer<Integer> p=new Printer<>(10);
	Printer<String> p1=new Printer<>("Deepak");
	p1.print();
	
}
}
