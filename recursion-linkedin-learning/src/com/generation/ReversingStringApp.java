package com.generation;

public class ReversingStringApp {

	public static void main(String[] args) {
		
		System.out.println(reverseString("Hola"));
	}
	
	public static String reverseString(String text) {
		
		if(text.length()==1 || text.length()==0)
			return text;
		
		return reverseString(text.substring(1))+text.charAt(0);
	}
}
