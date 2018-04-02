package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Symmetric {
 public static void main(String[] args) {
	 
	int [][] arr = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
	int n = arr.length;
	findsym(arr);
}
 static void findsym(int [][] arr) {
	 
 int n = arr.length;
 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
 	for(int i = 0 ; i< n; i++) {
 		int fir = arr[i][0];
 		int  sec = arr[i][1];
 		
 		Integer val = hm.get(sec);
 		 if (val != null && val == fir) {
 			System.out.println("(" + sec + ", " + fir + ")");
 		}
 			else  // Else put sec element of this pair in hash
                hm.put(fir, sec);
 		}
 		
 	}
 }

 
 
 
