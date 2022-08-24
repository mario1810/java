package com.generation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100");
        while(in.hasNextInt())
        {
            int a = in.nextInt();
            while(a < 1 || a > 100)
            {
                System.out.println("Invalid number, please try again: ");
                a = in.nextInt();
            }
            printBinary(a);
            System.out.println("\nEnter next number, q to exit");
        }
        in.close();
        
    }
    private static void printBinary(int b)
    {
    	int resDiv=b/2;
    	int res=b%2;
    	
    	if(resDiv==0) {
    		System.out.print(res+" ");
    		return;
    	}
    	printBinary(resDiv);
    	System.out.print(res+" ");
    }
}
