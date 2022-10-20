package com.ust.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	//Set set=new HashSet();
	Set set=new LinkedHashSet();
	set.add("amit");
	set.add(20);
	set.add("amit");
	set.add(null);
	set.add(400);
	set.add(20);
	System.out.println(set);
}
}
