package com.generation;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(19);
		list.insertAtHead(20);
		System.out.println(list);
		System.out.println("Length: "+list.length());
		System.out.println("Found " +list.find(12));
		list.delete(20);
		System.out.println(list);
	}

	
	
}
