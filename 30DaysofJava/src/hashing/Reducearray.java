package hashing;

import java.util.Arrays;
import java.util.HashMap;

//import java.lang.reflect.Array;

public class Reducearray {
	
	public static void main(String[] args) {
		int [] arr= {10, 20, 15, 12, 11, 50};
		reduce(arr);
		
	}

	static void reduce(int[] arr) {
		//create a temp array and copy the elements of the array to temp
		int[] temp = new int[arr.length];
		for (int i =0 ; i<arr.length; i++) {
			temp[i] = arr[i];
			}
		Arrays.sort(temp);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int val = 0;
		for(int i = 0; i<temp.length; i++) {	
			hm.put(temp[i], val++);
			
		}
		for (int i = 0; i < arr.length; i++) {
		        arr[i] = hm.get(arr[i]);
		}
		//print array
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
