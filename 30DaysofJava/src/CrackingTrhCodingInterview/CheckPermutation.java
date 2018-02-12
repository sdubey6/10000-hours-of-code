package CrackingTrhCodingInterview;

import java.util.Scanner;

public class CheckPermutation {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CheckPermutation iu = new CheckPermutation();
	 Scanner scan = new Scanner(System.in);
	 String s1 = scan.next();
	 //System.out.println(s);
	 String s2 = scan.next();
	 System.out.println(iu.CheckPermutation1(s1, s2));
	}
		boolean CheckPermutation1(String s1, String s2) {
			if (s1.length()!= s2.length()) {
				return false;
				
			}
			return sort(s1).equals(sort(s2));
			
		}
		String sort(String s) {
			char[] content = s.toCharArray();
			java.util.Arrays.sort(content);
			return new String(content);
			
		}
}
