package searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Heap {
	
	
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {12, 3, 5, 7, 19};
        int n = arr.length;
        int max = 0;
        
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        for(int i = 0; i<n; i++) {
        	p.add(arr[i]);
        }
        	
        // print a priority queue
        
        Iterator<Integer> itr = p.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        Heap ob = new Heap();
       // ob.heapify(arr, n, max);
 
       // System.out.println("Sorted array is");
        System.out.println(Arrays.toString(arr));
    }
}
