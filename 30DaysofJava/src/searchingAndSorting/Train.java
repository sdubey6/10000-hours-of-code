package searchingAndSorting;

import java.util.Comparator;

	public class Train{
		int arr;
		int dep;
		
		Train(int x, int y){
			this.arr = x;
			this.dep = y;
		}
	}
	class Arr_comaparator implements Comparator<Train>{
		
		@Override
	    public int compare(Train arg0, Train arg1) {
	        if(arg0.arr <= arg1.arr){
	            return -1;
	        }else{
	            return 1;
	        }
	    }
	}



