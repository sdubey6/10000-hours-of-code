package CrackingTrhCodingInterview;

import java.util.Scanner;

public class IsUnique { // complexity ? O(n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IsUnique iu = new IsUnique();
 Scanner scan = new Scanner(System.in);
 String s = scan.next();
 System.out.println(s);
 System.out.println(iu.IsUniqueChars(s));
}

	public boolean IsUniqueChars(String str) {
		if (str.length()>128)
			{ return false;
			}
		boolean [] char_set = new boolean[128];
		for(int i = 0; i<str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) { //Already found this char in the string
				return false;
				
			}
			char_set[val] = true;
		}
		return true;
		
	}
}
