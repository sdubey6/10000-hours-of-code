package CrackingTrhCodingInterview;

public class NGE {

	static class Stack{
		int top;
		int items[] = new int[100];
		void push(int n) {
			if (top == 99) {
				System.out.println("Stack overflow");
				
			}
			else {
				items[++top] = n;
				
			}
		}
		int pop() {
			if (top == -1) {
				System.out.println("Stack underfloe");
				return -1;
			}
			else {
				int element = items[top];
				top--;
				return element;
				
				
			}
		}
		boolean isEmpty() {
			return (top == -1) ? true: false;
			
		}
	}
		static void printgE(int arr[], int n) {
			int i = 0;
			Stack s = new Stack();
			s.top = -1;
			int element, next;
			s.push(arr[0]);
			for (i = 1; i < n; i++) {
				{
		            next = arr[i];
		 
		            if (s.isEmpty() == false) 
		            {
		                 
		                // if stack is not empty, then 
		                // pop an element from stack
		                element = s.pop();
		 
		                /* If the popped element is smaller than 
		                   next, then a) print the pair b) keep 
		                   popping while elements are smaller and 
		                   stack is not empty */
		                while (element < next) 
		                {
		                    System.out.println(element + " --> " + next);
		                    if (s.isEmpty() == true)
		                        break;
		                    element = s.pop();
		                }
		 
		                /* If element is greater than next, then 
		                   push the element back */
		                if (element > next)
		                    s.push(element);
		            }
		 
		            /* push next to stack so that we can find next
		               greater for it */
		            s.push(next);
		        }
		 
		        /* After iterating over the loop, the remaining 
		           elements in stack do not have the next greater 
		           element, so print -1 for them */
		        while (s.isEmpty() == false) 
		        {
		            element = s.pop();
		            next = -1;
		            System.out.println(element + " -- " + next); }
		        }

		
			
			
			
		}

	public static void main(String[] args) {
		int arr1[] = { 11, 13, 21, 3 };
        int n1 = arr1.length;
        printgE(arr1, n1);
	}
}
