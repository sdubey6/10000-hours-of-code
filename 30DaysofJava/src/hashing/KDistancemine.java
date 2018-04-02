package hashing;

public class KDistancemine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 2, 3, 4, 4};
		
		int k  = 3;
		
		System.out.println(kdist(arr, k));

	}
 static boolean kdist(int [] arr , int k) {
	 int n = arr.length;
	 int i = 0;
	 while( i< (n-k)) {
		 if(arr[i] == arr[i+k]) {
			 return true;
			 
		 }
		 else i++;
	 }
	 return false;
 }
}
