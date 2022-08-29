package com.generation.chapter3;

import java.util.List;
import java.util.stream.Collectors;

public class CountVowelsCConsonantsApp {
	
	
	public static void main(String[] args) {
        String s4 = "HellO2";
        String s2 = " there is a quiet Mouse";
        String s3 = "I am happy    ";
        String s1 = "HellO4";

        findNumberOfVowelsAndConsonantsMario(s4);
        findNumberOfVowelsAndConsonantsMario(s2);
        findNumberOfVowelsAndConsonantsMario(s3);
        
        findNumberOfVowelsAndConsonants(s1);
        findNumberOfVowelsAndConsonants(s2);
        findNumberOfVowelsAndConsonants(s3);

        findNumberOfVowelsAndConsonantsStreams(s1);
        findNumberOfVowelsAndConsonantsStreams(s2);
        findNumberOfVowelsAndConsonantsStreams(s3);

    }

	private static void findNumberOfVowelsAndConsonantsMario(String s1) {
		
		int vowelsCount=0;
		int consonantCount=0;
		String s2= s1.toLowerCase().replaceAll("[ 0-9,]+","");
		System.out.println(s2);
		for(int i=0; i<s2.length();i++) {
			char aux=s2.charAt(i);
			if(aux=='a' || aux=='e' || aux=='i' ||aux=='o' || aux=='u')
				vowelsCount++;
			else 
				consonantCount++;
		}
		
		 System.out.println("There are " + vowelsCount + " vowels in " + s1);
	        System.out.println("There are " + consonantCount + " consonants in " + s1);
	        System.out.println();
	}
	
	
	
	public static void findNumberOfVowelsAndConsonants(String input) {
	        int vowelsCount = 0;
	        int consonantCount = 0;
	        String vowels = "aeiouy";
	        String normalized = input.toLowerCase().trim();
	        char[] normalizedArray = normalized.toCharArray();

	        for (char c : normalizedArray) {
	            if (vowels.indexOf(c) != -1) {
	                vowelsCount++;
	            } else if (c != ' '){
	                consonantCount++;
	            }
	        }

	        System.out.println("There are " + vowelsCount + " vowels in " + input);
	        System.out.println("There are " + consonantCount + " consonants in " + input);
	        System.out.println();
	    }

	    public static void findNumberOfVowelsAndConsonantsStreams(String input) {
	        String vowels = "aeiouy";
	        String normalized = input.toLowerCase().trim();

	        List<Integer> letters = normalized.chars()
	                .filter(Character::isAlphabetic)
	                .boxed()
	                .collect(Collectors.toList());

	        long vowelsCount = letters.stream()
	                .filter(c -> vowels.indexOf(c) != -1)
	                .count();

	        long consonantCount = letters.stream().count() - vowelsCount;

	        System.out.println("There are " + vowelsCount + " vowels in " + input);
	        System.out.println("There are " + consonantCount + " consonants in " + input);
	        System.out.println();
	    }
}
