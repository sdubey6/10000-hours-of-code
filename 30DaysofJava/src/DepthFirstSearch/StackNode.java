package DepthFirstSearch;

//Java program to implement Stack using linked
//list so that reverse can be done with O(1) 
//extra space.
class StackNode {
 int data;
 StackNode next;
 public StackNode(int data)
 {
     this.data = data;
     this.next = null;
 }
}

class Stack {
 StackNode top;

 // Push and pop operations
 public void push(int data)
 {
     if (this.top == null) {
         top = new StackNode(data);
         return;
     }
     StackNode s = new StackNode(data);
     s.next = this.top;
     this.top = s;
 }
 public StackNode pop()
 {
     StackNode s = this.top;
     this.top = this.top.next;
     return s;
 }

 // prints contents of stack
 public void display()
 {
     StackNode s = this.top;
     while (s != null) {
         System.out.print(" " + s.data);
         s = s.next;
     }
     System.out.println();
 }

 // Reverses the stack using simple
 // linked list reversal logic.
 public void reverse()
 {
     StackNode prev, cur, next;
     cur = this.top;
     prev =null;
     //prev = this.top;
    // cur = cur.next;
     //prev.next = null;
     while (cur != null) {

         next = cur.next;
         cur.next = prev;
         prev = cur;
         cur = next;
     }
     this.top = prev;
 }
}


