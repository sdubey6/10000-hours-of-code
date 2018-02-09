import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i= 0; i< n;i++)
        { String s = in.nextLine();
         char[] charAr= s.toCharArray();
         
         for (int j = 0; j < charAr.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charAr[j]);
                }
         }
         System.out.print(" ");
         
         
         for (int j = 0; j < charAr.length; j++) {
                if (j % 2!= 0) {
                    System.out.print(charAr[j]);
                }
            }
            
            System.out.println();
        }
   
    in.close();
    }
}

