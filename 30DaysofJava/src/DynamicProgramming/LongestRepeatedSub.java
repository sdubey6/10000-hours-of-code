package DynamicProgramming;

public class LongestRepeatedSub {

	public static void main(String [] args) {
		
		// intput 2
		
		String s1 = "AABEBCDD";
		//String s2 = "GXTXAYB";
		char[] arr1 = s1.toCharArray();
		//char[] arr2 = s2.toCharArray();
		
		System.out.println(lcs(arr1));
		

	}

	static int lcs(char[] arr1) {
		
		int n1 = arr1.length;
		//int n2  =arr2.length;
		
		int[][] C = new int[n1+1][n1+1];
		//fill the base cases
		
		for (int i = 0; i <= n1; i++) {
			
			for (int j= 0; j<= n1; j++) {
				if (i == 0 || j == 0) {
			         C[i][j] = 0;
				}
				
				else if(arr1[i-1]== arr1[j-1] && i!=j) {
					C[i][j] = C[i-1][j-1] +1;
				}
					
				else C[i][j] = Math.max((C[i][j-1]), C[i-1][j]);
				}
		}
		pritGrid(C, n1+1);
		 String res = "";
		int i = n1, j = n1;
	    while (i > 0 && j > 0)
	    {
	        // If this cell is same as diagonally
	        // adjacent cell just above it, then 
	        // same characters are present at 
	        // str[i-1] and str[j-1]. Append any 
	        // of them to result.
	        if (C[i][j] == C[i-1][j-1] + 1)
	        {
	           res = res + arr1[i-1];
	           i--;
	           j--;
	        }
	 
	        // Otherwise we move to the side
	        // that that gave us maximum result
	        else if (C[i][j] == C[i-1][j])
	            i--;
	        else
	            j--;
	    }
	    System.out.println(res); //remeber to reverse it
	    
		return C[n1][n1];
			}
	static void pritGrid(int [][] arr1, int n1) {

   for(int i = 0; i < n1; i++)
   {
      for(int j = 0; j < n1; j++)
      {
         System.out.printf("%5d ", arr1[i][j]);
      }
      System.out.println();
   }
}
	}
		
	
