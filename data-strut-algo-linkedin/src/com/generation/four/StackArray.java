package com.generation.four;

public class StackArray {
	
	private int maxSize;
	private int myStack[];
	private int top;
	
	StackArray(int maxSize){
		this.maxSize=maxSize;
		this.top=-1;
		this.myStack=new int[maxSize];
	}
	
	
	public boolean push(int data) {
		if(top+1<maxSize) {
			top++;
			myStack[top]=data;
			return true;
		}
		return false;
	}
	
	public int peek() {
		return myStack[top];
	}
	
	public int pop(){
		if(top>=0) {
			int value=myStack[top--];
			return value;
		}
		return -1;
	}

}
