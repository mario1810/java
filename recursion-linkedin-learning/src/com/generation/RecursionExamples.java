package com.generation;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionExamples {

  static Scanner in = new Scanner(System.in);
  
    
  public static void main(String[] args) {
      //use recursion to print a list in reverse order
      int[] numList = {10,20,30,40,50};
      reversePrint(numList);
      System.out.println("");
      
      //use recursion to find the factorial of a number
//      System.out.println("Enter a number for the factorial problem: ");
//      int f = in.nextInt();
//      System.out.println("Factorial of 5 is: "+factorial(f));
      
      //call GCD
//      System.out.println("Enter two numbers and I'll find the GCD");
//      int x = in.nextInt();
//      int y = in.nextInt();
//      System.out.println(Greatest(x,y));
      
  }
  private static void reversePrint(int[] numbers)
  {
	  if(numbers.length==0) {
		  return;
	  }
	  System.out.print(numbers[numbers.length-1]+" ");
	  reversePrint(Arrays.copyOfRange(numbers, 0, numbers.length-1));
  }
  
  
  private static int factorial(int b)
  {
      return 0;
  }
  /*
  Greatest Common denominator recursive function
  based on Euclid
  */
  private static int Greatest(int a, int b)
  {
     return 0;
  }
}
