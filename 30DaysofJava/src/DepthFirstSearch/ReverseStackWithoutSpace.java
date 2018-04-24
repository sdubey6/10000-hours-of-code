package DepthFirstSearch;

public class ReverseStackWithoutSpace {
	 public static void main(String[] args)
	 {
	     Stack s = new Stack();
	     s.push(1);
	     s.push(2);
	     s.push(3);
	     s.push(4);
	     System.out.println("Original Stack");
	     s.display();

	     // reverse
	     s.reverse();

	     System.out.println("Reversed Stack");
	     s.display();
	 }
	}