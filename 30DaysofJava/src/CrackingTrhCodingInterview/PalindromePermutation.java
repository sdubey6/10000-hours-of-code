package CrackingTrhCodingInterview;

public class PalindromePermutation {

	public static void main(String[] args) {
		PalindromePermutation pp = new PalindromePermutation();
		System.out.println(pp.isPermutationOfPalindrome("uoiuo"));
		
		//O(N) running time 
		
		
	}
	
		// TODO Auto-generated method stub
		boolean isPermutationOfPalindrome (String s) {
			int[] map = new int[128];
	        for (int i = 0; i < s.length(); i++) {
	            map[s.charAt(i)]++;
	        }
	        int count = 0;
	        for (int key = 0; key < map.length && count <= 1; key++) {
	            count += map[key] % 2;
	        }
	        return count <= 1;
	    }
	}
