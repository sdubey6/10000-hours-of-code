package searchingAndSorting;

import java.util.Arrays;

public class MinPlatform {

	public int min_number(Train[] trains) {
		Arr_comaparator arr1 = new Arr_comaparator();
		Arrays.sort(trains, arr1);
		int n = trains.length;
		int plat_needed = 1;
		int result = 1;
		int i = 1, j = 0;
		
		while (i < n && j < n)
		   {
		      // If next event in sorted order is arrival, 
		      // increment count of platforms needed
		      if (trains[i].arr < trains[j].dep)
		      {
		          plat_needed++;
		          i++;
		  
		          // Update result if needed 
		          if (plat_needed > result) 
		              result = plat_needed;
		      }
		  
		      // Else decrement count of platforms needed
		      else
		      {
		          plat_needed--;
		          j++;
		      }
		   }
		  
		   return result;
		}

public static void main(String[] args) {
	Train[] trains = new Train[6];
	trains[0] = new Train(900, 910);	
	trains[1] = new Train(940, 1200);	
	trains[2] = new Train(950, 1120);	
	trains[3] = new Train(1500, 1900);	
	trains[4] = new Train(1800, 2000);	
	trains[5] = new Train(1100, 1130);
	
	MinPlatform mp = new MinPlatform();
 System.out.println(mp.min_number(trains));
	
	}
}