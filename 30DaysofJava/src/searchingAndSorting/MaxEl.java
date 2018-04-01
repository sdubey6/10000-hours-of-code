package searchingAndSorting;

public class MaxEl {
	
	public static void main(String [] args) {
		
	
	MaxEl me = new MaxEl();
	int [] arr = {1, 3, 50, 10, 9, 7, 6};
	int n = arr.length;
	System.out.println(me.findmax(arr, 0, n-1));
	}

int findmax(int[] arr, int low, int high) {
	//base case there is just one element
	
	if(low == high) {
		return arr[low];
	}
		//base case if there are two elements, and second is gretor than first
	if((high == low+1) && (arr[high]>arr[low])) {
		return arr[high];
	}
		//if the array is having 2 elements and low is greatr than high
	if((high == low+1) && (arr[low]>arr[high])) {
		return arr[low];
	}
	
	int mid = (high+low)/2;
	
	if((arr[mid]> arr[mid-1]) && (arr[mid] < arr[mid+1])) {
		return findmax(arr, mid+1, high);
	}
		else return findmax(arr, low, mid-1);
			
	}
	}
	

