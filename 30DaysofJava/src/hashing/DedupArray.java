package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class DedupArray {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(3);
	arr.add(5);
	arr.add(3);
	
	System.out.println(dedup(arr));
}

	
	static HashSet<Integer> dedup(ArrayList<Integer> arr){
		
		HashSet<Integer> h = new HashSet<Integer>();
		int n = arr.size();
		
		for(int i = 0; i< n; i++) {
			if(!h.contains(arr.get(i))) {
				h.add(arr.get(i));
			}
			
		}
		return h;
	}
	
	

}
