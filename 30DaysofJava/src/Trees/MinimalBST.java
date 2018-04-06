package Trees;

public class MinimalBST {
	static 	class Node{
		int data; 
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
		
	}
	
	
	static Node CMBST(int [] arr, int start, int end ) {
		if (end<start) {
			return null;
		}
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		n.left = CMBST(arr, start, mid-1);
		n.right = CMBST(arr, mid+1, end);
		return n;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(((CMBST(arr, 0, arr.length - 1)).left.left.data));
	}
}
