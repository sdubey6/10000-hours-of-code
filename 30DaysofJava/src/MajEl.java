
public class MajEl {

	public static void main(String[] args) {
		
		int [] arr = {1,2,2,2,2,2,3,3};
		int n = arr.length;
		int x = 2;
		if (findMajority(arr, n, x)==true)
            System.out.println(x + " appears more than "+
                              n/2 + " times in arr[]");
        else
            System.out.println(x + " does not appear more than " +
                              n/2 + " times in arr[]");
	}
	
	static boolean findMajority(int [] arr, int n,  int x) {
		
		int i = binarysearch(arr, 0, n-1, x);
		if (i == -1) return false;
		
		 if (((i + n/2) <= (n -1)) && arr[i + n/2] == x)
	            return true;
	        else
	            return false;
		
		
	}
	
 static	int binarysearch(int[] arr, int start, int end, int x) {
		// base case
		if(start==end) {
			return start;
		}
		if(start<end) {
			int mid = (start+end)/2;
			if((mid == 0 || (x > arr[mid-1]) && arr[mid]==x)) {
				return mid;
			}
						
				else if (x > arr[mid])
	                return binarysearch(arr, (mid + 1), end, x);
	            else
	                return binarysearch(arr, start, (mid -1), x);
				
			}
				return -1;	
}
	}

