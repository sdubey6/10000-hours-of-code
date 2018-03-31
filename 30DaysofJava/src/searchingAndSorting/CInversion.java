package searchingAndSorting;

public class CInversion {
	
	public static void main(String[] args) {
		CInversion ms = new CInversion();
		int[] arr = { 1, 20, 6, 4, 5};
		int n = arr.length;

		//System.out.println("Given Array");
		//printArray(arr);

		//CInversion ob = new CInversion();
		//int[] temp;
		System.out.println(mergeSort(arr, arr.length));
}
	static int mergeSort(int arr[], int array_size)
    {
        int temp[] = new int[array_size];
        return _mergesort(arr, temp, 0, array_size - 1);
    }
	
	static int _mergesort(int [] arr, int [] temp,  int l, int r) {
		int mid, inv_count =0;
		if (l <r) {
			
		mid = (l+r)/2;
		 inv_count  = _mergesort(arr, temp, l, mid);
	        inv_count += _mergesort(arr, temp, mid+1, r);
	      
	        /*Merge the two parts*/
	        inv_count += merge(arr, temp, l, mid+1, r);
	      }
	      return inv_count;
			}
	static int merge(int [] arr, int [] temp, int l , int mid, int r) {
		int i, j, k;
		int inv_count = 0;
		 i = l;
		 j = mid;
		 k = l;
		 
		 while((i <= mid - 1)&&(j < r)){
			 if(arr[i]<arr[j]) {
				 temp[k++] = arr[i++];
				 
				 
			 }
			 else
		        {
		          temp[k++] = arr[j++];
		      
		         /*this is tricky -- see above explanation/diagram for merge()*/
		          inv_count = inv_count + (mid - i);
		        }
			 
		 }
		 while (i <= mid - 1)
		        temp[k++] = arr[i++];
		      
		      /* Copy the remaining elements of right subarray
		       (if there are any) to temp*/
		      while (j <= r)
		        temp[k++] = arr[j++];
		      
		      /*Copy back the merged elements to original array*/
		      for (i=l; i <= r; i++)
		        arr[i] = temp[i];
		      
		      return inv_count;
		    }
	}
		
