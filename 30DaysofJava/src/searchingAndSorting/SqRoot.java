package searchingAndSorting;

public class SqRoot {

	public static void main(String[] args) {
		int x = 20;
		System.out.println(findroot(x));
		
	}
	
	static int findroot(int x) {
		//base case
		int start = 1, end = x, ans=0;
		if (x== 1|| x==0) {
			return 1;
			
		}
		//int y = x/2;
		while( start <= end) {
			int mid = (start+end)/2;
			if(mid*mid == x) {
				return mid;
			}
			if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid - 1;
        }
        return ans;
			
		}
		
	}
