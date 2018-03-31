package searchingAndSorting;

import java.util.PriorityQueue;
 
class MinSum
{
    // Returns sum of two numbers formed
    // from all digits in a[]
    public static long solve(int[] a)
    {
        // min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 
        // to store the 2 numbers formed by array elements to
        // minimize the required sum
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
 
        // Adding elements in Priority Queue
        for (int x : a)
            pq.add(x);
 
        // checking if the priority queue is non empty
        while (!pq.isEmpty())
        {
            num1.append(pq.poll()+ "");
            if (!pq.isEmpty())
                num2.append(pq.poll()+ "");
        }
 
        // the required sum calculated
        long sum = Long.parseLong(num1.toString()) +
                   Long.parseLong(num2.toString());
        System.out.println(num1);
        System.out.println(num2);
        return sum;
    }
 
    // Driver code
    public static void main (String[] args)
    {
        int arr[] = {5, 3, 0, 7, 4};
        System.out.println("The required sum is "+ solve(arr));
    }
}


