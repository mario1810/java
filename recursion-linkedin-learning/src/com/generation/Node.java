package com.generation;

public class Node {
	
    int value;
    String name;
    Node next;
    Node[] child;

    public Node () { 
        value = 0; 
        next = null; 
    } 

    public Node (int value, Node next) { 
        this.value = value; 
        this.next = next; 
    }
    public Node (String name, Node next) { 
        this.name = name; 
        this.next = next; 
    } 

    public String toString () { 
        return value + ""; 
    }
    
    
}
