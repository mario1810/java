package com.generation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("How many numbers should I print?");
		int input = in.nextInt();
		for(int i=0;i<=input; i++) {
			
			System.out.print(fibonacci2(i)+" ");
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
	
	public static Map<Integer,Integer> cache= new HashMap<>();
	private static int fibonacci2(int n) {
		if(cache.containsKey(n))
			return cache.get(n);
		if(n==0) {
			cache.put(0, 0);
			return 0;
		}
			
		if(n==1) {
			cache.put(1, 1);
			return 1;
		}
			
		int result= fibonacci(n-1)+fibonacci(n-2);
		if(!cache.containsKey(n)) {
			cache.put(n, result);
		}
		return result;
	}
}
