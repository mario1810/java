package com.generation.chapter4;

public class NodeApp {
	 public static Node deleteMiddle(Node head) {
		 //Base case (empty list or one node list)
	        if (head == null || head.getNext() == null) {
	            return head;
	        }
	        //To delete  the middle node, we'll be using a strategy
	        //with fast and slow pointers of the list. The slow pointer 
	        //will go to the next node, but the fast pointer will go two nodes at a time. 
	        //When the fast pointer is null, or at the last element of the list, the slow node
	        //will be at the middle of the list. That's the element we want to delete.
	        Node slow = head; // One node at time
	        Node fast = head; // Two nodes at time

	        Node previous = null;

	        while(fast != null && fast.getNext() != null) {
	            fast = fast.getNext().getNext();
	            previous = slow;
	            slow = slow.getNext();
	        }

	        // Delete middle node
	        //To delete a node, you have to set the next pointers to skip over it. 
	        //This means we'll need to set the previous node's next reference to the slow 
	        //node's next reference, deleting the slow node itself from the list.
	        previous.setNext(slow.getNext());

	        return head;
	    }

	    public static void printLinkedList(Node head) {
	        while(head != null) {
	            System.out.print(head.getData() + ", ");
	            head = head.getNext();
	        }
	        System.out.println("END");
	    }

	    public static Node<Integer> buildNode(int data) {
	        Node node = new Node();
	        node.setData(data);
	        node.setNext(null);
	        return node;
	    }

	    public static void main(String[] args) {

	        Node<Integer> head = buildNode(8);
	        Node<Integer> nodeA = buildNode(3);
	        Node<Integer> nodeB = buildNode(18);
	        Node<Integer> nodeC = buildNode(12);
	        Node<Integer> nodeD = buildNode(1);

	        head.setNext(nodeA);
	        nodeA.setNext(nodeB);
	        nodeB.setNext(nodeC);
	        nodeC.setNext(nodeD);

	        printLinkedList(head);
	        deleteMiddle(head);
	        printLinkedList(head);
	        deleteMiddle(head);
	        printLinkedList(head);
	    }
}
