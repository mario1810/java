package com.generation;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int number=153;
		System.out.println("El número "+number+" es un Armstrong number? "+isArmstrong(number));	
		number=198;
		System.out.println("El número "+number+" es un Armstrong number? "+isArmstrong(number));
		number=8208;
		System.out.println("El número "+number+" es un Armstrong number? "+isArmstrong(number));
		number=10;
		System.out.println("El número "+number+" es un Armstrong number? "+isArmstrong(number));
	}
	
	//Function that determine if a number is Armstrong or not
	public static boolean isArmstrong(int number) {
		int numDigits=0;
		//A copy of the number to work on it. 
		int aux=number;
		//determine the number of digits that the number has
		// i use a while loop to access to each digit of the number
		while(aux>0) {
			//If you divide aux by 10, you shrink the size of the number in one unit
			// because it's a whole division
			aux/=10;
			//For each iteration we increment our variable in one unit. 
			numDigits++;
		}
		//Determine the  sum of the digits  raised to the power
		//of the total number of digits.
		aux=number; // reset  to the original number
		int sum=0; // variable to store the sum off the digits
		// I use a while loop to access to each digit of the number
		while(aux>0) {
			//The remainder of this operation is the digit at the most right side
			int digit=aux%10;
			// For each iteration we add the  the power of each digit.  
			sum+=(int)Math.pow(digit, numDigits);
			//shrink the original number
			aux/=10;
		}
		// we check if  the number is a armstrong number
		if(sum==number)
			return true;
		return false;
	}
}
