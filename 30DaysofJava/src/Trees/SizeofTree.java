package Trees;

public class SizeofTree {
Node root;

static class Node{
	int data; 
	Node left, right;
Node(int data){
	this.data = data;
	left = null;
	right = null;
}
	
	public static void main(String[] args) {
		SizeofTree tree = new SizeofTree();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.left.left.left = new Node(7);
	  
	        System.out.println(tree.size(tree.root));
	}
}

 int size(Node node) {
	 if (node == null) {
		 return 0;
	 }
	 
	 return (size(node.left)+1+size(node.right));
	 
	 
 }
	// TODO Auto-generated method stub
	
}
