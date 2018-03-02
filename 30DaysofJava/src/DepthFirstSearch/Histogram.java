package DepthFirstSearch;

public class Histogram {

	public static void main(String[] args) {
		Histogram h = new Histogram();
		int[] a = {2,3,5,7,1,1};
		
		h.drawHistrogram(a);
		
	}
	public static void drawHistrogram(int[] intArray){
		int temp = 0;
		for(int i=0; i<intArray.length; i++){
			temp = intArray[i];
			for(int j=0; j <temp; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
