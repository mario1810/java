package com.generation;

public class PrintLinkedListExam {
	
	//it's going to point out to the first node of my linkedlist
	static Node head;
	   
	   public static void main(String[] args) {
	       Node node1 = new Node(1, null);
	       Node node2 = new Node(2, null);
	       Node node3 = new Node(3, null);
	       
	       node1.next=node2;
	       node2.next=node3;
	       node3.next=null;
	       
	       head=node1;
	       
	       printList(head);
	   }

	private static void printList(Node node) {
		System.out.print(node.value+" ");
		if(node.next==null)
			return;
		printList(node.next);
	}
}
