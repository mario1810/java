package com.generation;

public class DetecttingPalinromesApp {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("amanaplanacanalpanama"));

	}
	
	public static boolean isPalindrome(String s) {
		
		if(s.length()==0 || s.length()==1) {
			return true;
		}
		
		/*
		if(s.charAt(0)==s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1))) {
			return true;
		}else {
			return false;
		}*/
		
		return s.charAt(0)==s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1));
	}

}
