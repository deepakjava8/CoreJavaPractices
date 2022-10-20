package com.ust.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GenericsDemo {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Deepak");
	//list.add(100);
	list.add("Sachin");
	
	List<Employee> list2=new ArrayList<>();
	list2.add(new Employee("dk"));
	//list2.add("deepak");
	
	
	Map<String, Integer> map=new HashMap<>();
	map.put("Deepak", 101);
	//map.put("amit", "DK");
	
	Map<String, List<String>> map2=new HashMap<>();
}
}
class Employee{
	private String name;
	public Employee(String name) {
		this.name=name;
		
	}
}
