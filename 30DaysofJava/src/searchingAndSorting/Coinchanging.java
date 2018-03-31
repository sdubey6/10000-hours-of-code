package searchingAndSorting;

public class Coinchanging {

	int numberofcoins(int [] arr, int n, int v) {
		int count = 0;
		for (int i=n-1; i>=0; i--) {
			while(v >= arr[i]) {
				v = v-arr[i];
				count++;
				//numberofcoins(arr, n, v);
			}
				
		}
		return count;
		
	}
	public static void main(String[] args) {
		Coinchanging cc = new Coinchanging();
			
		int [] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		int n = arr.length;
		int V = 70;
		System.out.println(cc.numberofcoins(arr, n, V));
		
	}
}
