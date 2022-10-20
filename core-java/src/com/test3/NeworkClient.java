package com.test3;

public class NeworkClient {
public static void main(String[] args) {
	Airtel air=new Airtel();
	air.networkService();
	air.newFatures();
	
	JIO jio=new JIO();
	jio.networkService();
	jio.newFatures();
	
	SIMProvider.m3();
}
}
