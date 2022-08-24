package com.generation;

public class ReversePrintListChallenge {
		static Node head;
		   
		   public static void main(String[] args) {
		       Node node1 = new Node(1, null);
		       Node node2 = new Node(2, null);
		       Node node3 = new Node(3, null);
		       
		       node1.next=node2;
		       node2.next=node3;
		       node3.next=null;
		       
		       head=node1;
		       
		       printReverseList(head);
		   }

		private static void printReverseList(Node node) {
			
			if(node.next==null) {
				System.out.print(node.value+" ");
				return;
			}
			printReverseList(node.next);
			System.out.print(node.value+" ");
		}
}
