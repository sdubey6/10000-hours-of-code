package Lynda;

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionFactorial rf = new RecursionFactorial();
		System.out.println(rf.fact(5));
		

	}
	public long fact(int n) {
		if (n==0) { //put the break ocndition otherwise it wil give stack over flow...
			return 1;
		}
		long result = n*fact(n-1);
		return result;
		
	}

}
