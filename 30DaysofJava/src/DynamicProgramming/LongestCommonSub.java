package DynamicProgramming;

public class LongestCommonSub {
	
	public static void main(String [] args) {
		
	// intput 2
	
	String s1 = "AGGTAB";
	String s2 = "GXTXAYB";
	char[] arr1 = s1.toCharArray();
	char[] arr2 = s2.toCharArray();
	
	System.out.println(lcs(arr1, arr2));
	

}

static int lcs(char[] arr1, char[] arr2) {
	
	int n1 = arr1.length;
	int n2  =arr2.length;
	
	int[][] C = new int[n1+1][n2+1];
	//fill the base cases
	
	for (int i = 0; i <= n1; i++) {
		
		for (int j= 0; j<= n2; j++) {
			if (i == 0 || j == 0) {
		         C[i][j] = 0;
			}
			
			else if(arr1[i-1]== arr2[j-1]) {
				C[i][j] = C[i-1][j-1] +1;
			}
				
			else C[i][j] = Math.max((C[i][j-1]), C[i-1][j]);
			}
	}
	return C[n1][n2];
		}
	
}
