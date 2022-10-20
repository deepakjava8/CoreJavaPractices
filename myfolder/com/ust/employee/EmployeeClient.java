package com.ust.employee;

class Parent{
	public final void m1() {
		
	}
}
//class Clild extends Parent{
//	public void m1() {
//		
//	}
//}
public class EmployeeClient {
	public static void m1() {
		System.out.println("static - method-2");
	}
	
	static{
		System.out.println("static - block");
	}
public static void main(String[] args) {
	//EmployeeClient e1=new EmployeeClient();
	//m1();
	EmployeeClient.m1();
	EmployeeClient.m1();
	
//	 final String panCard="ABCD123";
//	 
//	Employee e1=new Employee(101, "Siva", 10000, "IT");
//	System.out.println(e1);
//	
//	boolean updateEmploye = e1.updateEmploye("Siva Reddy");
//	System.out.println(updateEmploye);
}
}
