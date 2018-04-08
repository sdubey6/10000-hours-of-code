package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;

import Trees.ConnectSameLevel.Node;

public class Traversals {
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
		// TODO Auto-generated method stub
		Traversals  tree = new Traversals();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        /*System.out.println("Preorder traversal of binary tree is ");
        preorder(root);
 
        System.out.println("\nInorder traversal of binary tree is ");
        inorder(root);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        postorder(root);
        
        System.out.println("\n Level order traversal of binary tree is ");
        levelorder(root); */
        
        //printVerticalOrder(root);
        printDiagonalOrder(root);
				
				
	}
	
	static void inorder(Node root) {
		 if (root == null)
	            return;
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}
	
	static void preorder(Node root) {
		 if (root == null)
	            return;
		System.out.print(root.data);
		preorder(root.left);
		
		preorder(root.right);
	}
	
static void postorder(Node root) {
	 if (root == null)
         return;
		
		postorder(root.left);
		
		postorder(root.right);
		System.out.print(root.data);
	}
static void levelorder(Node root) {
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	
	while(!q.isEmpty()) {
		Node tempnode = q.poll();
		System.out.print(tempnode.data);
		
		if(tempnode.left!=null) {
			q.add(tempnode.left);
		}
		
		if(tempnode.right!=null) {
			q.add(tempnode.right);
		}
	}

}

static void getVerticalOrder(Node root, int hd,
        TreeMap<Integer,Vector<Integer>> m)
{
// Base case
if(root == null)
return;

//get the vector list at 'hd'
Vector<Integer> get =  m.get(hd);

// Store current node in map 'm'
if(get == null)
{
get = new Vector<>();
get.add(root.data);
}
else
get.add(root.data);

m.put(hd, get);

// Store nodes in left subtree
getVerticalOrder(root.left, hd-1, m);

// Store nodes in right subtree
getVerticalOrder(root.right, hd+1, m);
}

// The main function to print vertical oder of a binary tree
// with given root
static void printDiagonallOrder(Node root)
{
// Create a map and store vertical oder in map using
// function getVerticalOrder()
TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
int hd =0;
getVerticalOrder(root,hd,m);

// Traverse the map and print nodes at every horigontal
// distance (hd)
for (Entry<Integer, Vector<Integer>> entry : m.entrySet())
{
System.out.println(entry.getValue());
}
}
static void printDiagonalOrder(Node root) {
	HashMap <Integer, Vector<Integer>> m = new HashMap<>();
	int d = 0;
	
	getDiagonalOrder(root, 0, m);
	
	for(Entry<Integer, Vector<Integer>> e : m.entrySet()) {
		System.out.println(e.getValue());
	
	//print code
}
}

static void getDiagonalOrder(Node root, int d, HashMap <Integer, Vector<Integer>> m) {
	
	if (root == null) return;
	
	Vector<Integer> v = m.get(d);
	if(v == null) {
		v = new Vector<Integer>();
		v.add(root.data);
	}
	else
		v.add(root.data);
	m.put(d,  v);
	
	// Store nodes in left subtree
    getDiagonalOrder(root.left, d+1, m);
     
    // Store nodes in right subtree
    getDiagonalOrder(root.right, d, m);	
			
	}
	
}
