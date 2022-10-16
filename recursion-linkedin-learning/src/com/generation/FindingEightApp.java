package com.generation;

public class FindingEightApp {
	public static void main(String[] args) {
		Node root = new Node("Alice", null);
		Node node2 = new Node("Bob", null);
		Node node3 = new Node("Caroline", null);
		Node node4 = new Node("Darya", null);
		Node node5 = new Node("Eve", null);
		Node node6 = new Node("Fred", null);
		Node node7 = new Node("Gonzalo", null);
		Node node8 = new Node("Hadassah", null);
       
       root.child=new Node[]{node2,node3};
       node2.child=new Node[]{node4};
       node3.child=new Node[]{node5,node6};
       node4.child=null;
       node5.child=new Node[]{node7,node8};
       node6.child=null;
       node7.child=null;
       node8.child=null;
       System.out.println("PRE");
       System.out.println("Name eigth letters long: "+preorderTraverse(root));
       System.out.println("POST");
       System.out.println("Name eigth letters long: "+postorderTraverse(root));
	}
	
	public static String preorderTraverse(Node node) {
		System.out.println("Visiting the node "+node.name);
		String name="None";
		if(node.name.length()==8) {
			return node.name;
		}
		
		if(node.child==null)
			return name;
		
		for(Node childNode: node.child) {
			name=preorderTraverse(childNode);
			if(!name.equals("None")) {
				return name;
			}
			
		}
		return name;
	}
	
	
	public static String postorderTraverse(Node node) {
		String name="None";
		
		if(node.child==null) {
			System.out.println("Visiting the node "+node.name);
			if(node.name.length()==8) {
				name=node.name;
			}
			return name;
		}
		for(Node childNode: node.child) {
			name=postorderTraverse(childNode);
			if(!name.equals("None")) {
				return name;
			}
		}
		System.out.println("Visiting the node "+node.name);
		if(node.name.length()==8) {
			name=node.name;
		}
		return name;
	}
}
