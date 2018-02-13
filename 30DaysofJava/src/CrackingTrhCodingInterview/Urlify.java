package CrackingTrhCodingInterview;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Urlify {

	void replaceSpaces(char [] str, int truelength) {
		int spacecount = 0;
		int index = 0;
		int i = 0;
		for(i = 0; i< truelength; i++) {
			if (str[i] == ' ') {
				spacecount++;
			}
			
		}
	
	index = truelength + spacecount*2;
	if(truelength > str.length) str[truelength] = '\0'; //ending array in case of excess spaces
	for(i = truelength-1;i>=0;i--) {
		if(str[i]== ' ') {
			str[index - 1] = '0';
			str[index - 2] = '2';
			str[index - 3] = '%';
			index = index-3;
			
			
		}
		else {
			str[index - 1] = str[i];
			index--;
		}
	}
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Urlify iu = new Urlify();
		 Scanner scan = new Scanner(System.in);
		 int s2 = scan.nextInt();
		 String s1 = scan.next();
		 System.out.println(s1.length());
		 char[] ch = new char[s1.length()] ;
		 for (int i = 0; i < s1.length();i++) {
			 
			 ch[i]= s1.charAt(i);
		 }
		 //char [] s_array = s1.toCharArray();
		 System.out.println(new String(ch));
		 
		 
		 iu.replaceSpaces(ch, s2);
		 scan.close();
		 
	}

}
