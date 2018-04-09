package searchingAndSorting;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int d = 2;
		int n = arr.length;
		
		int [] x1 = (rotate(arr, d, n));
		System.out.println(Arrays.toString(x1));
	}
	
	static int[] rotate(int[] x, int d, int n) {
		int[] temp = new int[d];
		
		for(int i = 0;i<d; i++) {
			temp[i]= x[i];
		}
		
		//temp = {1,2}
		
		for(int i = 0; i<n-2; i++) {
			x[i] = x[i+2];
		}
		
		for( int i = 0; i<d; i++) {
			x[n-d+i] = temp[i];
			
		}
		//System.out.println(x.toString());
		return x;
		
	}
}
