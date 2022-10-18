package com.generation;

public class DoublyLinkedList {
	private DoublyLinkedNode head;	
	
	public void insertAtHead(int data) {
		DoublyLinkedNode newNode= new DoublyLinkedNode(data);
		newNode.setNextNode(head);
		if(head!=null) {
			head.setPreviousNode(newNode);
		}
		head=newNode;
	}
	
	
	public int length() {
		int length=0;
		DoublyLinkedNode current=this.head;
		while(current!=null) {
			length++;
			current=current.getNextNode();
		}
		return length;
	}
	
	@Override
	public String toString() {
		String result="{";
		DoublyLinkedNode current= this.head;
		
		while(current!=null) {
			result+=current.getData()+", ";
			current=current.getNextNode();
		}
		result+="}";
		return result; 
	}
}
