package com.generation;

public class LinkedList {
	
	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode= new Node(data);
		newNode.setNextNode(this.head);
		this.head=newNode;
	}

	public int length() {
		int length=0;
		Node current=this.head;
		while(current!=null) {
			length++;
			current=current.getNextNode();
		}
		return length;
	}
	
	public void deleteFromHead() {
		this.head=this.head.getNextNode();
	}
	
	public Node find (int data) {
		Node current= this.head;
		while(current!=null) {
			if(current.getData()==data) {
				return current;
			}
			current=current.getNextNode();
		}
		//if the data is not on the list
		return null;
	}
	
	
	public void delete (int data) {
		Node current= this.head;
		Node before=null;
		Node next=this.head.getNextNode();
		
		if(head.getData()==data) {
			
			this.head=this.head.getNextNode();
			return; 
		}
		
		while(current!=null) {
			
			if(current.getData()==data) {
				before.setNextNode(next);
				return;
			}
			before=current;
			next=current.getNextNode().getNextNode();
			current=current.getNextNode();
			
		}
	}
	
	@Override
	public String toString() {
		String result="{";
		Node current= this.head;
		
		while(current!=null) {
			result+=current.toString()+", ";
			current=current.getNextNode();
		}
		result+="}";
		return result; 
	}
	
	
	
}
