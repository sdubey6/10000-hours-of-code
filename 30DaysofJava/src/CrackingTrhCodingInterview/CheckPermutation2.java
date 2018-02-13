package CrackingTrhCodingInterview;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation2 {

	public static void main(String [] args) {
		CheckPermutation2 iu = new CheckPermutation2();
		 Scanner scan = new Scanner(System.in);
		 String s1 = scan.next();
		 //System.out.println(s);
		 String s2 = scan.next();
		 System.out.println(iu.CheckPermutation21(s1, s2));
		 scan.close();
		 
		}
	boolean CheckPermutation21(String s1, String s2) {
		if (s1.length()!= s2.length()) {
			return false;
			
		}
		int [] letters = new int[128];
		char [] s_array = s1.toCharArray();
		System.out.println(new String(s_array));
		

		for(char c:s_array) { //count number of each char in s1
			letters[c]++;
				
		}
		System.out.println(Arrays.toString(letters));
		
		for(int i = 0;i<s2.length();i++) {
			int c = (int) s2.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
			System.out.println(letters);

		}
		return true;
	}
	
	}

	
	

