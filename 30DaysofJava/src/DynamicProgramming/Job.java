package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;
public class Job {
	int start;
    int end;
    int profit;
    Job(int start,int end,int profit){
        this.start= start;
        this.end = end;
        this.profit= profit;
    }
}

class FinishTimeComparator implements Comparator<Job>{

    @Override
    public int compare(Job arg0, Job arg1) {
        if(arg0.end <= arg1.end){
            return -1;
        }else{
            return 1;
        }
    }
    
}

/**
 * http://www.cs.princeton.edu/courses/archive/spr05/cos423/lectures/06dynamic-programming.pdf
 * Given set of jobs with start and end interval and profit, how to maximize profit such that 
 * jobs in subset do not overlap.
 */
