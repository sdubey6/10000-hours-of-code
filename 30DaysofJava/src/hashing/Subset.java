package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Subset {

	public static void main(String [] args) {
		
		int [] arr1 = {11, 1, 13, 21, 3, 7};
		int [] arr2 = {11, 3, 7, 1};
		
		System.out.println(usinghashing(arr1, arr2));
		System.out.println(usingsorting(arr1, arr2));
	}
	
	static boolean usinghashing(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		HashSet<Integer> hm = new HashSet<Integer>();
		
		for (int i = 0; i< arr1.length; i++) {
			if(!hm.contains(arr1[i])) {
				hm.add(arr1[i]);
			}
					
		}
		 for(int i = 0; i < arr2.length; i++)
	        {
	            if(!hm.contains(arr2[i]))
	                return false;
	        }
	        return true;
		
	}
	
	
	static boolean usingsorting(int[] arr1, int [] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int i = 0, j = 0;
        
        if(m < n)
        return false;
         
        Arrays.sort(arr1); //sorts arr1
        Arrays.sort(arr2); // sorts arr2
 
        while( i < n && j < m )
        {
            if( arr1[j] < arr2[i] )
                j++;
            else if( arr1[j] == arr2[i] )
            {
                j++;
                i++;
            }
            else if( arr1[j] > arr2[i] )
                return false;
        }
         
        if( i < n )
            return false;
        else
            return true;
}
}
