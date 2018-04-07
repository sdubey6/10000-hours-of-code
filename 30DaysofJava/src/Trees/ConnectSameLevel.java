package Trees;

import Trees.SizeofTree.Node;

public class ConnectSameLevel {
	Node root;

	static class Node{
		int data; 
		Node left, right, nextright;
	Node(int data){
		this.data = data;
		left = null;
		nextright  =null;
		right = null;
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectSameLevel tree = new ConnectSameLevel();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.left.left.left = new Node(7);
	        tree.connect(tree.root);

	}
	
	void connect(Node root) {
		if (root== null) return; 
		
		root.nextright = null;
		
		connectother(root);
		
	}
	void connectother(Node p) {
		if(p == null) {
			return;
		}
		
		if(p.left!=null) {
			p.nextright=p.right;
		}
		
		if(p.right != null)
			p.right.nextright = (p.nextright!=null)? p.nextright.left : null;
		connectother(p.left);
		connectother(p.right);
	}
	

}
