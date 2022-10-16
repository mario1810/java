package com.generation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumbersSum {
	
	//return the total sum of all the integers
	
	public static void main(String[] args) {
		
		int[] array= new int[] {1,2,3,4,5};
		System.out.println(sum(array));
	}// end main

	public static int sum(int[] arr) {
		
		//base case
		if(arr.length==0)
				return 0;
		
		return arr[0]+sum(Arrays.copyOfRange(arr,1, arr.length));
	}
}
