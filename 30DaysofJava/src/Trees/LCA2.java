package Trees;

import Trees.Traversals.Node;

public class LCA2 {
	static Node root;
	static boolean v1 = false;
	static 	boolean v2 = false;

	static class Node{
		int data; 
		Node left, right;
	Node(int data){
		this.data = data;
		left = null;
		//nextright  =null;
		right = null;
	}
	
	}
	public static void main(String[] args) {
		LCA2  tree = new LCA2();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
		tree.findLCA(root, 3, 4);
	}
	}


static Node findLCA(Node root, int n1, int n2) {
	if(root == null) {
		return null;
	}
	else if (root.data == n1){
		v1 = true;
		return root;
	}
	else if  (root.data == n2){
		v2 = true;
		return root;
	
		
}
