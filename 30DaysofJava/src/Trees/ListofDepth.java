package Trees;

import java.util.ArrayList;
import java.util.LinkedList;

import Trees.MinimalBST.Node;

public class ListofDepth {
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
	
	 void LID(Node root, ArrayList<LinkedList<Node>> lists, int level) {
		if(root==null) {
			return;
		}
		LinkedList<Node> list = null;
		if(lists.size()== level) {
			list = new LinkedList<Node>();
			lists.add(list);}
		else { list = lists.get(level);}
		list.add(root);
		LID(root.left, lists, level+1);
		LID(root.right, lists, level+1);
	}
		
	ArrayList<LinkedList<Node>> LID(Node root){
		
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		LID(root, lists, 0);
			return lists;
		}

	public static void main(String[] args) {
}
}
