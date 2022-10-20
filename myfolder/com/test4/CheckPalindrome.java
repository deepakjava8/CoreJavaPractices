package com.test4;

public class CheckPalindrome {
public static void main(String[] args) {
	String result = reverseString("AmmA");
	System.out.println(result);
}
public static String reverseString(String str) {
	char[] array = str.toCharArray();
	String result="";
	for(int i=array.length-1;i>0;i--) {
		System.out.println(result.charAt(i));
		result=result+result.charAt(i);
	}
	return result;
}
}
