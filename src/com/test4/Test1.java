package com.test4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import com.ust.employee.AnimalDemoTest;

public class Test1 {
public static void main(String[] args) {
	
	List<Employee> list = Arrays.asList(new Employee(1, "Annette", Arrays.asList(111,222,434,555), 20000, "HR"),
				new Employee(2, "Prem", Arrays.asList(111,222,434,555), 70000, "IT"),
				new Employee(3, "Priya", Arrays.asList(111,222,434,555), 60000, "HR"),
				new Employee(4, "Cerin", Arrays.asList(111,222,434,555), 50000, "IT"),
				new Employee(5, "Soumya", Arrays.asList(111,222,434,555), 40000, "IT"),
				new Employee(6, "Vishnu", Arrays.asList(111,222,434,555), 30000, "FINANCE"));
	
	
	Employee max = list.stream().max(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getSalary()>o2.getSalary()) {
				return 1;
			}else if(o1.getSalary()<o2.getSalary()) {
				return -1;
			}else {
				return 0;
			}
		}
		
	}).get();
	
	System.out.println(max);
}
}

class Employee{
	
	private int id;
	private String name;
	private List<Integer> phone;
	private int salary;
	private String dept;
	
	public Employee() {}

	public Employee(int id, String name, List<Integer> phone, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.dept = dept;
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

	public List<Integer> getPhone() {
		return phone;
	}

	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}
	
}