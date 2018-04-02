package DynamicProgramming;

public class LongestSubarraySum {
	public static void main(String[] args) {
		
		
		int [] arr = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Max value of the sum is " + longestsubsum(arr));

	}
	
	static int longestsubsum(int[] arr) {
		int n =  arr.length;
		int [] C= new int[n];
		for(int i = 0; i< n; i++) {
			C[i] = arr[i];
			
		}
		for (int i = 1; i < n; i++) {
			if(C[i-1]+arr[i] > C[i]) {
				C[i] = C[i-1]+arr[i];
			}
				
		}

		for (int i = 0; i < n; i++) {
			System.out.println(C[i]);
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < C.length; i++) {
		      if(C[i] > max) {
		         max = C[i];
		      }
	
	}
		return max;
}
}
