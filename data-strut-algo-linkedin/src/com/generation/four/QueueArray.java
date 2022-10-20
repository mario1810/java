package com.generation.four;

public class QueueArray {

	private int maxSize;
	private int [] myQueue;
	private int head;
	private int tail;
	
	QueueArray(int maxSize){
		this.maxSize=maxSize;
		this.head=-1;
		this.tail=-1;
		myQueue= new int[maxSize];
	}
	
	public void enqueue(int data) {
		
		//first element
		if(head==-1) {
			head++;
			tail++;
			myQueue[head]=data;
		}else {
			//it's not the first element
			if(tail+1>=maxSize)
				return;
			tail++;
			myQueue[tail]=data;
		}
	}
	
	public int dequeue() {
		
		if(head+1<maxSize) {
			int value=myQueue[head];
			head++;
			return value;
		}
		return -1;
	}
	
	public int peek() {
		if(head!=-1)
			return myQueue[head];
		else
			return -1;
	}
}
