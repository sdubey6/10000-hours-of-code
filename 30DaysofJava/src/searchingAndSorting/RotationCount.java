package searchingAndSorting;

import java.util.Arrays;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,1,2,3,4};
		int d = 2;
		int high = arr.length;
		int low = 0;
		
		int x1 = (rotatecount(arr, low, high));
		//System.out.println(Arrays.toString(x1));
	}

	static int rotatecount(int[] a, int low, int high) {
		int mid = (low+high)/2;
		if(a[mid]<a[high]) {
			return rotatecount(a, low, mid-1);
			
		}
		
	
	)
		
	}
}
