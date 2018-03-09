package CrackingTrhCodingInterview;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
private Queue<Integer> primary = new LinkedList<Integer>();
private Queue<Integer> secondary = new LinkedList<Integer>();

public Stack() {}

public void push(int x) {
	secondary.add(x);
	while(!primary.isEmpty()) {
		secondary.add(primary.remove());
		
	}
	Queue<Integer> temp = primary;
	primary = secondary;
	secondary = temp;
	
}
public int pop() {
	if (primary.isEmpty()) throw new IndexOutOfBoundsException();
	return primary.remove();
	}
	public static void main(String [] args) {
		
		{ Stack s = new Stack();
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(5);
s.push(6);
s.pop();
System.out.println(s.toString());

	
		
}
	}
}


