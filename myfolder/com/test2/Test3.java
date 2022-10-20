package com.test2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Test3 {
public static void main(String[] args) {
	List<Employee> empList = List.of(new Employee(1, "prem", 35,"IT"),new Employee(2, "shakthi", 34,"IT"),new Employee(3, "judy", 36,"Finance"),new Employee(4, "vishnu", 33,"Salse"),new Employee(4, "zedeza", 33,"Finance"));
	empList.forEach(System.out::println);
	System.out.println("------------------------------");
	List<Employee> sort1 = empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
	sort1.forEach(System.out::println);
	System.out.println("------------------------------");
	List<Employee> sort2 = sort1.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
	sort2.forEach(System.out::println);
	System.out.println("------------------------------");
	
	List<Employee> sortId = empList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
	sortId.forEach(System.out::println);
	System.out.println("------------------------------");
	
	List<Employee> collect1 = empList.stream().sorted(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if(o1.getAge() == o2.getAge()) {
				return o1.getName().compareTo(o2.getName());
			}else if(o1.getAge()>o2.getAge()) {
				return 1;
			}else {
				return -1;
			}
		};
	}).collect(Collectors.toList());
	collect1.forEach(System.out::println);
	
	System.out.println("-----------grouping by example-1---------------");
	
	Map<String, List<Employee>> map1 = empList.stream().collect(Collectors.groupingBy(Employee::getDeptartment));
	Map<String, Optional<Employee>> groupBy = empList.stream().collect(Collectors.groupingBy(Employee::getDeptartment,Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
	System.out.println(groupBy);
	System.out.println("-----------grouping by example-2---------------");
	Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptartment,Collectors.counting()));
	System.out.println(collect);
	
	Map<Boolean, Long> collect2 = empList.stream().collect(Collectors.partitioningBy(e->e.getDeptartment().equals("Finance"),Collectors.counting()));
	System.out.println(collect2);
	
}
}
