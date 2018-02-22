package CrackingTrhCodingInterview;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		OneAway one = new OneAway();
		
		System.out.println(one.oneeditreplace(s1, s2));
		s.close();
				
	}
	
	public boolean oneeditreplace (String s1,String s2){
		//char[] ch1 = s1.toCharArray();
		//char[] ch2 = s2.toCharArray();
		boolean founddifference = false;
		for (int i = 0;i < s1.length();i++) {
			if(s1.charAt(i)!= s2.charAt(i)) {
				if (founddifference) {
					return false;
				}
				founddifference = true;
			}
		}
		return true;
	}

}
