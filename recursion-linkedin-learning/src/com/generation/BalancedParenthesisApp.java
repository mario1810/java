package com.generation;

public class BalancedParenthesisApp {

	public static void main(String[] args) {
		
		int pairs=2;
		getBalancedParens(pairs,pairs,""); 
	}
	
	public static void getBalancedParens(int open, int close, String s) {
		
		if(open==0 && close==0) {
			System.out.print(s+" ");
			return;
		}
		if(open>0) {
			getBalancedParens(open-1,close,s+"(");
		}
		if(close>open) {
			getBalancedParens(open,close-1,s+")");
		}
		
	}
}
