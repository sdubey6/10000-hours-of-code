package hashing;

import java.util.HashMap;
import java.util.HashSet;

//public class LinkedList {
		Node head;
		class Node{
	 int data;
	 Node next;
	 
	 Node(int data){
		 this.data = data;
		 this.next = null;
	 }
		}
	 //add to the start of the ll
	 void push(int data) {
		 Node newnode = new Node(data);
		 newnode.next = head;
		 head = newnode;
	 }
	 // append to the last of the ll
	public  void append(int data) {
		 if(this.head == null) {
			 Node newnode =  new Node(data);
			 this.head = newnode;
			 return;
		 }
		 Node n1 = this.head;
		 Node n2 = new Node(data);
		 
		 while(n1.next != null){
			 n1 = n1.next; 
	 }
		 n1.next = n2;
	        n2.next = null;
 }
	static LinkedList getIntersection(LinkedList ll1, LinkedList ll2) {
		HashSet<Integer> hs = new HashSet<Integer>();
		LinkedList ll3 = new LinkedList();
		Node n1 = ll1.head;
		Node n2 = ll2.head;
		
		while(n1 !=null) {
			if(hs.contains(n1.data))
	        {
	            hs.add(n1.data);
	        }
	        else
	        {
	            hs.add(n1.data);
	        }
			n1 = n1.next;
		}
		while(n2 !=null) {
			if(hs.contains(n2.data)) {
				//hs.add(n1.data);
				ll3.push(n2.data);
			}
			n2 = n2.next;
		}
		return ll3;
	}
	/* Utility function to print list */
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    static LinkedList getUnion(LinkedList ll1, LinkedList ll2) {
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	Node n1 = ll1.head;
    	Node n2 = ll2.head;
    	LinkedList ll3 = new LinkedList();
    	while(n1 != null) {
    		if(!hm.containsKey(n1.data)) {
    			hm.put(n1.data, 1);   	
    		}
    		else {
    			int val = hm.get(n1.data);
    			hm.put(n1.data, val+1);
    		}
    		n1= n1.next;
    				}
    		while(n2 != null)
    	    {
    	        if(hm.containsKey(n2.data))
    	        {
    	            int val = hm.get(n2.data);
    	            hm.put(n2.data, val + 1);
    	        }
    	        else
    	        {
    	            hm.put(n2.data, 1);
    	        }
    	        n2 = n2.next; 
    	    }
    		// Eventually add all the elements
    	    // into the result that are present in the hmap
    	    for(int a:hm.keySet())
    	    {
    	        ll3.append(a);
    	    }
    	    return ll3;
    	}
    	
	public static void main(String args[])
    {
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();
        LinkedList union = new LinkedList();
        LinkedList intersection = new LinkedList();
 
        /*create a linked list 10->15->4->20 */
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);
 
        /*create a linked list 8->4->2->10 */
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);
 
       // intersection = intersection.getIntersection(llist1.head,
        //                                          llist2.head);
        //union=union.getUnion(llist1.head, llist2.head);
        System.out.println("First List is");
        llist1.printList();
 
        System.out.println("Second List is");
        llist2.printList();

       // intersection = getIntersection(llist1, llist2);
       //printList(union);
        //intersection.printList();
        union = getUnion(llist1, llist2);
        union.printList();
}
	
		
	}
	}