package CrackingTrhCodingInterview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DeleteDupsll {
 //without existing outer class, no use of inner class, hence inner (nested) class
	static class Node{
		int data;
		public Node next = null;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		public void addToTail(int d){
			Node node = new Node(d);
			Node current = this;  //head of the linkedlist
			while(current.next != null){
				current = current.next;
			}
			current.next = node;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(0);
		for(int i = 1; i < 21; i++){
			head.addToTail(i);
		}
		head.addToTail(0);
		head.addToTail(0);
		head.addToTail(0);
		head.addToTail(8);	
		head.addToTail(0);
		head.addToTail(8);
		removeDuplicate1(head);
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
		public static void removeDuplicate1(Node head){
			Set<Integer> set = new HashSet<Integer>();
			set.add(head.data);
			//Node previous = head;
			//Node current = previous.next;
			Node point = head.next;
			while(point != null){
				if(!set.contains(point.data)){
					set.add(point.data);
					//previous = previous.next;
					//current = current.next;
					point = point.next;
				}else{
					System.out.println("Delete " + point.data);
					//current = current.next;
					//previous.next = current;
					point = point.next;
				}
			}
	}
			

	}

