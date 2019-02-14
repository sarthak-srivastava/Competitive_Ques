import java.io.*;
import java.lang.*;

class GFG {
    
    
	public static void main (String[] args) {
	    System.out.println(minStep(432,new int[432+1]));
	    	}
	public static int minStep(int n ,int[] qb)
	{
	    if(n<=1)
	    return 0;
	    if(qb[n]!=0)
	    return qb[n];
	    else if(n%2 == 0 && n%3 == 0)
	    return qb[n] = 1+Integer.min(minStep(n/2,qb),Integer.min(minStep(n/3,qb),minStep(n-1,qb)));
	     else if(n%3 == 0)
	    return qb[n] = 1+Integer.min(minStep(n/3,qb),minStep(n-1,qb));
	    else if(n%2 == 0)
	    return qb[n] = 1+Integer.min(minStep(n/2,qb),minStep(n-1,qb));
	   
	    else
	    return qb[n] = 1+minStep(n-1,qb);
	}
}
