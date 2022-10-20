package com.ust.java8;


interface SIMProvider{
	public void networkService();
	public default void newFeatureService() {
		System.out.println("new Default Features by SIM Provider");
	}
	
	public static void UtilMethod() {
		System.out.println("Utility feature purpose");
	}
}

class Airtel implements SIMProvider{

	@Override
	public void networkService() {
		System.out.println("We provide Aritel Network-service");
	}

}

class Docomo implements SIMProvider{

	@Override
	public void networkService() {
		System.out.println("We provide Docomo Network-service");
	}
	
}
public class DefaultMethodDemo {
public static void main(String[] args) {
	Airtel air=new Airtel();
	air.networkService();
	
	Docomo doc=new Docomo();
	doc.networkService();
	
	SIMProvider.UtilMethod();
}
}
