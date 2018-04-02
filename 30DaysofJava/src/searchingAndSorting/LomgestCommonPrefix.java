package searchingAndSorting;

public class LomgestCommonPrefix {
	
	public static void main(String [] args) {
		

	String s1 = "geeksforgeeks";
	String s2 = "geeks";
	String s3 = "geezer";
	char[] arr1 = s1.toCharArray();
	char[] arr2 = s2.toCharArray();
	
	System.out.println(commomPrefixUtil(arr1, arr2));
}

	
//since we are looking for common PREFIX and not common subsequence, we should see is arr1[i] == arr2[j]
	 static String commomPrefixUtil(char[] arr1, char[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		String result = "";
		for (int i = 0, j = 0; i< n1 && j< n2; i++, j++) {
			if(arr1[i] != (arr2[j])) {
				break;
			}
			result= result+arr1[i];
		}
		return result;
}
}

	