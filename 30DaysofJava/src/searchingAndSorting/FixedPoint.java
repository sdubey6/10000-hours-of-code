package searchingAndSorting;

public class FixedPoint {
	
	public static void main(String[] args) {
		int[] arr1 = {-10, -1, 0, 3 , 10, 11, 30, 50, 100};
		//int[] arr2 = {};
		int n = arr1.length;
		
		FixedPoint md =  new FixedPoint();
		System.out.println(md.fixed(arr1, 0, n-1));
	}
 int fixed(int[] arr, int low, int high)  {   
         /* low + (high - low)/2; */
         int mid = (low + high)/2;  
         if(mid == arr[mid])
             return mid;
         if(mid > arr[mid])
             return fixed(arr, (mid + 1), high);
         else
             return fixed(arr, low, (mid -1));
     
    
     /* Return -1 if there is 
        no Fixed Point */
     
 }
  
 }
 
 
