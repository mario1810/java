package com.generation;

import java.util.Arrays;

public class PermutationsApp {

	public static void main(String[] args) {
		
//		for(String s: getPerms("ABCD")) {
//			System.out.println(s);
//		}
		System.out.println("Permutación 2");
		String s="illloopp";
		char[] arrayS= s.toCharArray();
		Arrays.sort(arrayS);
		s=String.valueOf(arrayS);
		System.out.println("chido "+s);
		//getPerms2(s, 0,s.length()-1);
		
//		System.out.println("Permutación  repetition");
//		String zz="ABC";
//		char[] data = new char[zz.length()];
//		allLexicographicRecur(zz, data,zz.length()-1,0);
//		
//		System.out.println("k==2");
//		s="ABC";
		getPerms3(s, 0,s.length()-1,s.length()-1);
	}
	
	public static String[] getPerms(String s) {
		
		
		//Number of permutations
		int size=1;
		for(int i=1; i<=s.length();i++) {
				size*=i;
		}
		String newPermutation[]=new String[size];
		
		//Base case
		if(s.length()==0 || s.length()==1) {
			newPermutation[0]=s;
			return newPermutation;
		}
		
		//recursive case
		char head=s.charAt(0);
		String tail=s.substring(1);
		String[] permutations=getPerms(tail);
		int j=0;
		for(String tailPerm:permutations) {
			for(int i=0; i<tailPerm.length()+1;i++) {
				newPermutation[j++]=tailPerm.substring(0, i)+String.valueOf(head)+tailPerm.substring(i);
			}
		}
		return newPermutation;
	}

	public static void getPerms2(String s, int init, int end) {
		
		if(init==end) {
			System.out.println(s);
		}
		else {
			for(int i=init; i<=end; i++) {
				s =swap(s,init, i);
				getPerms2(s,init+1,end);
				// Volvemos a la forma original para el siguiente swap
				s =swap(s,init, i);
			}
		}
			
		
	}
	
	public static String swap(String s, int i, int j) {
		char[] charArray= s.toCharArray();
		char temp= charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	
	
	
	//En el arreglo data solo es para guardar cada permutación individual, sólo lo voy actualizando
	// un caracter al inicio, y recorro todo el string recusrsivamente 
	static void allLexicographicRecur(String str, char[] data, int last, int index)
		{
		int length = str.length();
		
		// One by one fix all characters at the given index
		// and recur for the subsequent indexes
		for (int i = 0; i < length; i++)
		{
		
		// Fix the ith character at index and if
		// this is not the last index then
		// recursively call for higher indexes
		data[index] = str.charAt(i);
		
		// If this is the last index then print
		// the string stored in data[]
		if (index == last)
		System.out.println(new String(data));
		else
		allLexicographicRecur(str, data, last,
		                 index + 1);
		}
	}

	
	public static void getPerms3(String s, int init, int end, int k) {
		
		if(k==0) {
			System.out.println(s.substring(0, init));
		}
		else if(init==end) {
			System.out.println(s);
		}
		else {
			for(int i=init; i<=end; i++) {
				s =swap(s,init, i);
				getPerms3(s,init+1,end,k-1);
				// Volvemos a la forma original para el siguiente swap
				s =swap(s,init, i);
			}
		}
			
		
	}
}
