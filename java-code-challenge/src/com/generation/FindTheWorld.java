package com.generation;

public class FindTheWorld {

	public static void main(String[] args) {
		String msj="I can program in Java";
		int n=3; 
		System.out.println("La palabra "+n+ " es "+findWord(n,msj));
		n=2; 
		System.out.println("La palabra "+n+ " es "+findWord(n,msj));
		n=4; 
		System.out.println("La palabra "+n+ " es "+findWord(n,msj));
	}
	
	public static String findWord(int n, String myString) {
		//The split method divide the string by a specific character, in
		//this case a  white space (" "). We store all the words are store
		// in an array
		String [] words=myString.split(" ");
		// if the n is out of the number of words, we return a message
		//indicating this situation
		if(n<=0 || n> words.length)
				return (n+"es no valido");
		// If n is valid, we return the requested word
		// we substract one to n, because the arrays' position starts from 0.
		// so, to access to the firs word, internally we access to the  the position 0 of the array
		return words[n-1];
	}
}


