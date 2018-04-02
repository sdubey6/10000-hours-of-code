package searchingAndSorting;

public class Longestprefixcharbychar {
	
	public static void main(String[] args) {
		
	
	String[] arr = {"geeksforgeeks", "geezer", "geek"};
	System.out.println(longest(arr));

}

 static String longest(String[] arr1) {
	 int min = findminlength(arr1);
	 String result = " ";
	 
	 int n = arr1.length;
	 //int n = (arr1.length) / arr1[0].length();
	 for (int i = 0; i < min; i++) {
		 
	 char current = arr1[0].charAt(i);
	 for(int j = 0 ; j < n; j++) {
		 if (arr1[j].charAt(i) != current) {
			 return result;
		 }
	 
	 }
	 result = result+current;
	 }
	 return (result);
}
 static int findminlength(String[] arr1) {
	 int min = arr1[0].length();
	 for (int i = 1;i< arr1.length; i++) {
		 if(arr1[i].length() < min) {
			 min = arr1[i].length();
		 } 
	 }
	 return min;
 }
}