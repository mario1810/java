package com.generation;

public class LongestPalindormeApp {
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("aaabb"));
	}
	
	
	static int resultStart=0;
	static int resultLength=0;
	
	public static String longestPalindrome(String s) {
	
		int strLength=s.length();
		if(strLength==0 || strLength==1)
			return s;
		//Loop through the string and check character by character if  each individual
		//Character us a possible centrer of a possibe palindrome subtring
		for(int i=0; i<strLength-1;i++) {
			//String, middle point
			checkPali(s,i,i); //odd case <start and end ate the same because is odd) 
			checkPali(s,i,i+1); //even case <the middle point are two possitons
		}
		
		return s.substring(resultStart,resultStart+resultLength);
	}
		
	private static  void checkPali(String s, int begin, int end) {
	
		while(begin>=0 && end<s.length() && s.charAt(end)==s.charAt(begin)) {
			begin--;
			end++;
		}
		//Siempre que sale es porque hay un palindromo
		if(resultLength<end-begin-1) {
			resultLength=begin+1;
			resultLength=end-begin-1; // because they're are +1 -1 than where the oalindorme positions 
		}
	}
		
}
