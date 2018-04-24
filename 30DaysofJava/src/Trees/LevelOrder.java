package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
 Node root;
	
	 static class Node{
		
		int data;
		Node left, right;
		
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
}

	public static void main(String[] args) {
		LevelOrder lo = new LevelOrder();
		
		Node node = new Node(1);
		 
        lo.root = new Node(1);
        lo.root.left = new Node(2);
        lo.root.right = new Node(3);
        lo.root.left.left = new Node(4);
        lo.root.left.right = new Node(5);
        lo.root.right.right = new Node(6);
         
        printLevelOrder(lo.root);
	}
	static void  printLevelOrder(Node root) {
		if(root == null) return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		 while(true)
	        {
	             
	            // nodeCount (queue size) indicates number of nodes
	            // at current level.
	            int nodeCount = q.size();
	            if(nodeCount == 0)
	                break;
	             
	            // Dequeue all nodes of current level and Enqueue all
	            // nodes of next level
	            while(nodeCount > 0)
	            {
	                Node node = q.peek();
	                System.out.print(node.data + " ");
	                q.remove();
	                if(node.left != null)
	                    q.add(node.left);
	                if(node.right != null)
	                    q.add(node.right);
	                nodeCount--;
	            }
	            System.out.println();
	        }
			
				
		}
		
		
		
		
		
	}
