package com.generation;

import java.util.Arrays;

public class SortingAlgorithmsApp {

	public static void main(String[] args) {
		int [] A= {7,2,5,8,1,10};
		//selectionSort(A);
		System.out.println(Arrays.toString(A));
		
	}
	
	public static void selectionSort(int [] array) {
		for(int i=0; i<array.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex])
					minIndex=j;
			}
			int temp=array[i];
			array[i]=array[minIndex];
			array[minIndex]=temp;
		}
	}
	
	public static void insertionSort(int [] array) {
		for(int i=0; i<array.length;i++) {
			int current=array[i];
			int j=i-1;
			while(j>=0 && array[j]>current) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		}
	}
	
	public static void binarySearch(int number, int []array) {
		int iniP=0;
		int endP=array.length-1;
		while(endP>=iniP) {
			int middleP=(endP-iniP)/2+iniP;
			if(array[middleP]==number) {
				System.out.println("Número está en el index "+middleP);
				break;
			}else if(array[middleP]>number) {
				endP=middleP-1;
			}else if(array[middleP]<number) {
				iniP=middleP+1;
			}
		}
				
		
		
	}

}
