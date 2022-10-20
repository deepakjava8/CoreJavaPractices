package com.test2;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String deptartment;
	public Employee() {}
	public Employee(int id, String name, int age, String deptartment) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.deptartment = deptartment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDeptartment() {
		return deptartment;
	}
	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", deptartment=" + deptartment + "]";
	}
	
	
}
