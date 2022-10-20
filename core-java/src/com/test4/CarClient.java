package com.test4;
class P{
	int x=10;
}
class C extends P{
	int y=20;
	public void m1() {
		System.out.println(" Parent varible : "+x);
		System.out.println(" Child varible : "+y);
	}
}
class Car{
	String name;
	String color;
	String brand;
	public Car() {}
	public Car(String name, String color, String brand) {
		this.name = name;
		this.color = color;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", brand=" + brand + "]";
	}
	
	
}
class Driver{
	Car car;
	{
		car=new Car("Nexon","White","Tata");
	}
	public void getCarDetails() {
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.brand);
	}
}
public class CarClient {
public static void main(String[] args) {
	Driver d=new Driver();
	d.getCarDetails();
	C c=new C();
	c.m1();
}
}
