package com.ust.oops;
class Engine{
	private String modelNo;
	String color;
	public String getModelNo() {
		return modelNo;
	}
}
class Car{
	Driver driver; // week Association
	Engine e;	// strong Association
	 
	 public void getEngineInfo() {
		 System.out.println(e.color+"\t"+e.getModelNo());
	 }
}
class Driver{
	
}
public class AggregationDemo {
public static void main(String[] args) {
	
}
}
