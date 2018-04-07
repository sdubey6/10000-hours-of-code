package Trees;

public class PrintAncestor {
	Node root;
	
	static class Node{
		int data; 
		Node left, right;
	Node(int data){
		this.data = data;
		left = null;
	}
	}
	
	
	
	public static void main(String[] args) {
		PrintAncestor tree = new PrintAncestor();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.left.left.left = new Node(7);
	  
	        tree.printAncestors(tree.root, 7);
	}
	
	boolean printAncestors(Node node, int key) {
		
		//base case
		if(node == null)
			return false;
		
		if(node.data == key) {
			
			System.out.println(node.data);
			return true;
			}
		
			/* If target is present in either left or right subtree 
	           of this node, then print this node */
			
			if (printAncestors(node.left, key)|| printAncestors(node.right, key)) 
			{
			System.out.print(node.data + " ");
            return true;
			}
		
		return false;
		}
		
	}
		
	


