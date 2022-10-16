package com.generation;

import java.util.Arrays;

public class CombinationApp {

	public static void main(String[] args) {
		System.out.println("All combinations");
		for(String combo:getCombos("ABC")){
			System.out.println(combo);
		}
		
		System.out.println("All combinations k==2");
		for(String combo:getCombos("AB",2)){
			System.out.println(combo);
		}
		
	}
	
	public static String[] getCombos(String s){
		
		if(s.length()==0)
			return new String[] {s};
		//Head is for the decision (take it or not)
		String head=String.valueOf(s.charAt(0));
		String tail=s.substring(1);
		//Generate combinations  on  the rest of elements (without the first element) 
		String[]combWithoutFirst=getCombos(tail);
		//Generate combinations with the first element (using combWithoutFirst)
		String[] combWithFirst= new String[combWithoutFirst.length];
		for(int i=0; i<combWithoutFirst.length;i++) {
			combWithFirst[i]=head+combWithoutFirst[i];
		}
		//Join the 2 arrays
		String[] comb= new String[combWithoutFirst.length*2];
		int pos=0;
		for(int i=0;i<combWithoutFirst.length;i++, pos++) {
			comb[pos]=combWithoutFirst[i];
			comb[pos+combWithoutFirst.length]=combWithFirst[i];
		}
		return comb;
	}
	
public static String[] getCombos(String s, int k){
		
		if(k==0)
			return new String[] {""};
		else if (s.length()==0)
			return new String[] {};
		//Head is for the decision (take it or not)
		String head=String.valueOf(s.charAt(0));
		String tail=s.substring(1);
		//Generate combinations with the first element
		String[]tailCombo=getCombos(tail, k-1);
		//Generate combinations with the first element
		String[]tailCombo2=getCombos(tail, k);
		
		//Join the 2 arrays
		String[] comb= new String[tailCombo.length+tailCombo2.length];
		int pos=0;
		for(int i=0;i<tailCombo.length;i++, pos++) {
			comb[pos]=head+tailCombo[i];
		}
		for(int i=0;i<tailCombo2.length;i++, pos++) {
			comb[pos]=tailCombo2[i];
		}
		return comb;
	}
}


