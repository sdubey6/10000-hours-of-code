package searchingAndSorting;

public class RepeatingEl {
	
	public static void main (String[] args)
    {
        int arr[] = { 1, 2 , 3 , 4 , 4};
        int n = arr.length;
        System.out.println(" " +
        		repeating(arr,0, n-1));
    }
	
	static int repeating(int[] arr, int low , int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		
		if(arr[mid] !=mid+1) {
			if(mid > 0 && arr[mid]==arr[mid-1]) {
				return mid;
			
			}
			return repeating(arr, low, mid-1);
		}
		// If mid is at proper position then repeated one is in
        // right.
        return repeating(arr, mid+1, high);
		
	}

}
