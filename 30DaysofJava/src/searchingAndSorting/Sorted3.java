package searchingAndSorting;

import java.util.HashMap;
import java.util.HashSet;

public class Sorted3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,11,10,5,6,2,31};
		sorted3(arr);

	}

	 static void sorted3(int[] x) {
		int n = x.length;
		HashSet<Integer> hm = new HashSet<Integer>(); 
		for (int i = 0; i< n; i++) {
			if(x[i]< x[i+1]) {
				hm.add(x[i+1]);
			}
		}
		
		
		
		
	}
}
