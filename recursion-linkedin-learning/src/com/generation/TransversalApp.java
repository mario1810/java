package com.generation;

public class TransversalApp {

	public static void main(String[] args) {
			Node root = new Node('A', null);
			Node node2 = new Node('B', null);
			Node node3 = new Node('C', null);
			Node node4 = new Node('D', null);
			Node node5 = new Node('E', null);
			Node node6 = new Node('F', null);
			Node node7 = new Node('G', null);
			Node node8 = new Node('H', null);
	       
	       root.child=new Node[]{node2,node3};
	       node2.child=new Node[]{node4};
	       node3.child=new Node[]{node5,node6};
	       node4.child=null;
	       node5.child=new Node[]{node7,node8};
	       node6.child=null;
	       node7.child=null;
	       node8.child=null;
	       
	       System.out.println("pre");
	       preorderTraverse(root);
	       System.out.println("\npost");
	       postorderTraverse(root);
	       System.out.println("\nin");
	       inorderTraverse(root);
	       System.out.println("\ndepth "+getDepth(root));
	       
	}
	
	public static void preorderTraverse(Node node) {
		System.out.print((char)node.value+" ");
		//si no tiene hijos se acabó.
		if(node.child==null)
			return;
		//Para cada nodo hijo, recorre.
		for(Node childNode: node.child)
			preorderTraverse(childNode);
	}
	
	public static void postorderTraverse(Node node) {
		//si no tiene hijos se acabó.
		if(node.child==null) {
			System.out.print((char)node.value+" ");
			return;
		}
			
		//Para cada nodo hijo, recorre.
		for(Node childNode: node.child) {
			postorderTraverse(childNode);
		}
		System.out.print((char)node.value+" ");
	}
	
	public static void inorderTraverse(Node node) {
		
		if(node.child==null) {
			System.out.print((char)node.value+" ");
			return;
		}
		
		
		if(node.child.length>=1) {
			inorderTraverse(node.child[0]);
		}
		System.out.print((char)node.value+" ");
		if(node.child.length>=2) {
			inorderTraverse(node.child[1]);
		}
		
	}
	
	
	public static int getDepth(Node node) {
		
	
		if(node.child==null) { //leaf
			return 0;
		}
		int maxChildDepth=0;
		for(Node childNode: node.child) {
			int childDepth=getDepth(childNode);
			if(childDepth>maxChildDepth)
				maxChildDepth=childDepth;
		}
		return maxChildDepth+1; // 1 means the actual node
		
	}

}
