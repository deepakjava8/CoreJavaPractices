package com.ust.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("amit");
	
	list.add(1);
	list.add("Suresh");
	list.add(400);
	list.add(null);
	list.add("amit");
	list.add(null);
	
	System.out.println(list);
	System.out.println("------");
	for(Object o : list) {
		System.out.println(o);
	}
	
}
}
