package com.generation.chapter3;

import java.util.stream.IntStream;

public class PalindromeApp {

	 public static boolean palindromeCheckerTraditional(String original) {
	        String normalized = original.toLowerCase();
	        StringBuilder reversed = new StringBuilder();

	        // String reversed = StringUtils.reverse(normalized);
	        // String reversed = new StringBuilder(normalized).reverse().toString();

	        for (int i = normalized.length() - 1; i >= 0; i--) {
	            reversed.append(normalized.charAt(i));
	        }

	        return normalized.equals(reversed.toString());
	    }

	    public static boolean palindromeCheckStreams(String original) {
	        String normalized = original.toLowerCase();

	        return IntStream.range(0, normalized.length() / 2)
	                .allMatch(i ->
	                        normalized.charAt(i) ==
	                                normalized.charAt(normalized.length() -i -1));
	    }
	    
	 public static void main(String[] args) {
	        String s1 = "maDam";
	        String s2 = "raceCar";
	        String s3 = "aBba";
	        String s4 = "swims";
	        String s5 = "wifI";

	        System.out.println(palindromeCheckerMario(s1));
	        System.out.println(palindromeCheckerMario(s2));
	        System.out.println(palindromeCheckerMario(s3));
	        System.out.println(palindromeCheckerMario(s4));
	        System.out.println(palindromeCheckerMario(s5));
	        
	        System.out.println();
	        
	        System.out.println(palindromeCheckerTraditional(s1));
	        System.out.println(palindromeCheckerTraditional(s2));
	        System.out.println(palindromeCheckerTraditional(s3));
	        System.out.println(palindromeCheckerTraditional(s4));
	        System.out.println(palindromeCheckerTraditional(s5));

	        System.out.println();

	        System.out.println(palindromeCheckStreams(s1));
	        System.out.println(palindromeCheckStreams(s2));
	        System.out.println(palindromeCheckStreams(s3));
	        System.out.println(palindromeCheckStreams(s4));
	        System.out.println(palindromeCheckStreams(s5));

	   }

	private static boolean palindromeCheckerMario(String s1) {
		if(s1.trim().length()==0)
			return false;
		String s2=s1.trim().replaceAll("[\\. ]+","").toUpperCase();
		int init=0;
		int end=s2.length()-1;
		while(init<=end) {
			if(s2.charAt(init++)!=s2.charAt(end--)) {
				return false;
			}
		}
		return true;
	}
}
