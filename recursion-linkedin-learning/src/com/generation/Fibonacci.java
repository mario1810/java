package com.generation;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("How many numbers should I print?");
		int input = in.nextInt();
		for(int i=0;i<=input; i++) {
			
			System.out.print(fibonacci(i)+" ");
		}
		in.close();
	}
	
	private static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)	
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
