package com.generation;

import java.util.Scanner;

public class PowerFunction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your base number and exponent:");
		double number = in.nextDouble();
		int exp = in.nextInt();
		System.out.println(power(number,exp));
		in.close();
	}
	private static double power(double x,int n) {
	
		if(n==0)
			return 1.0;
		double aux=power(x,n/2);
		if(n%2==0) {
			return aux*aux;
		}else{
			return aux*aux*x;
		}
	}
}
