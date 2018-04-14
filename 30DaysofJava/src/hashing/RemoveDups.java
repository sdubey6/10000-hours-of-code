package hashing;

import java.util.HashSet;

public class RemoveDups {

	 static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main (String[] args) {
		RemoveDups rd = new RemoveDups();
		rd.head = new Node(4);
		rd.push(5);
		rd.push(5);
		rd.push(9);
		rd.push(10);
		rd.push(5);
		
		printll((head));
		dedup(head);
		printll(head);
	}
	
	void push(int key) {
		Node newnode = new Node(key);
		newnode.next = head;
		head = newnode;
	}
	
	static void printll(Node head){
		while(head!= null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	static void dedup(Node head) {
		HashSet <Integer> h = new HashSet <Integer>();
		Node prev = null;
		Node temp = head;
		while(temp!=null) {
			if( h.contains(temp.data)) {
				prev.next = temp.next;	
			}
			else { h.add(temp.data);
			prev = temp;}
			
			temp = temp.next;
			
		}
		
		
		
	}
	
}
