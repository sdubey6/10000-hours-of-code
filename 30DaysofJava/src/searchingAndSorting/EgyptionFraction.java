package searchingAndSorting;


public class EgyptionFraction {


    public static void egyptionFraction(long nr,long dr)
    {        // nr =6  dr = 14
        if(nr ==0 || dr ==0)
            return;
        if(nr%dr ==0)
        {
            System.out.print(""+nr/dr);
            return;
        }
            
        if(dr%nr==0)
        {
            System.out.print("1/"+dr/nr);
            return;   
        }
        if(nr>dr)
        {
            System.out.print(""+nr/dr+"+");
            egyptionFraction(nr%dr, dr);
            return;
        }
           //dr>nr  and  dr%nr is non zero
           long n = dr/nr +1;   //ceiling       n=3
           System.out.print("1/"+n+"+");
           egyptionFraction(nr*n-dr, dr*n);   //   recursion on remaining part
    }
    
    
    
    public static void main(String[] args) {
        long nr = 6, dr = 14;
        egyptionFraction(nr, dr);
        
    }
    
}
