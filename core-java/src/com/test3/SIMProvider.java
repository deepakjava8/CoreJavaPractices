package com.test3;

public interface SIMProvider {
public void networkService();
public default void newFatures() {
	System.out.println("Specific new Feature providing");
}
public static void m3() {
	System.out.println("This is Utility Method");
}
}

class Airtel implements SIMProvider{

	@Override
	public void networkService() {
		System.out.println("We provide Airtel Network Service");
		
	}
	
}
class Docommo implements SIMProvider{

	@Override
	public void networkService() {
		System.out.println("We provide Docomo Netork Service");
		
	}
	
	public void m3() {
		System.out.println("This is Utility Method - Ovverriden-For docomo");
	}
	
	
}
class JIO implements SIMProvider{

	@Override
	public void networkService() {
		System.out.println("We provide JIO Network service");
		
	}
	
	public  void newFatures() {
		System.out.println("Specific new Feature providing-for JIO Sim");
	}
	
	
}
