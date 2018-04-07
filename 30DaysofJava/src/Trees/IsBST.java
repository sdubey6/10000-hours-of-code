package Trees;

import Trees.ListofDepth.Node;

public class IsBST {
	static Node root;
	static 	class Node{
		int data; 
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
}
	
	public static void main(String[] args) {
		IsBST tree = new IsBST();
		 tree.root = new Node(4);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(5);
	        tree.root.left.left = new Node(1);
	        tree.root.left.right = new Node(3);
	 
	        if (tree.isBST(root))
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
		
		
	}
	
	static boolean isBST(Node root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	static boolean isBST(Node root, int x,int y) {
		if(root == null) {
			return 	true;
		}
		 if (root.data < x || root.data > y)
	            return false;
		 return (isBST(root.left, x, root.data-1) &&
	                isBST(root.right, root.data+1, y));
	}
}