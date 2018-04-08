package Trees;

import java.util.Iterator;
import java.util.LinkedList;

import Trees.Traversals.Node;

public class ConverttoLL {
	
	static Node root;
	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			right = null;
			left = null;
		}
	}
	
	public static void main(String[] args) {
		
		ConverttoLL tree = new ConverttoLL()
;
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.printconvert(root);
		}

	Node concatenate(Node a, Node b) {
		if(a==null) return b;
		if (b == null) return a;
		
		a.right = b;
		b.left = a;
		return a;
		
	}

	
}
