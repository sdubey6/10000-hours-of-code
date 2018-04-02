package hashing;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderBT {
	static class Node
	{
		int key;
		Node right;
		Node left;
		
		Node(int value){
			this.key = value;
			this.left = null;
			this.right= null;
		}
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);	
	}
static void printVerticalOrder(Node root) {
	//Create a map and store vertical order usng another utility method
	
	TreeMap<Integer, Vector<Integer>> tm = new TreeMap<Integer, Vector<Integer>>();
	int hd = 0;
	getVerticalOrder(root, hd, tm);
	for (Entry<Integer, Vector<Integer>> entry : tm.entrySet())
    {
        System.out.println(entry.getValue());
    }	
}
static void getVerticalOrder(Node root, int hd,
        TreeMap<Integer,Vector<Integer>> m) {
	// Base case
    if(root == null)
        return;
     
    //get the vector list at 'hd'
    Vector<Integer> get =  m.get(hd);
     
    // Store current node in map 'm'
    if(get == null)
    {
        get = new Vector<>();
        get.add(root.key);
    }
    else
        get.add(root.key);
     
    m.put(hd, get);
     
    // Store nodes in left subtree
    getVerticalOrder(root.left, hd-1, m);
     
    // Store nodes in right subtree
    getVerticalOrder(root.right, hd+1, m);
	
	
	
}
}
