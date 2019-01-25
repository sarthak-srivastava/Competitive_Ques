/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int den = sc.nextInt();
		    int[] coin = new int[den];
		    for(int i = 0; i<den; i++)
		    coin[i] = sc.nextInt();
		    int amt = sc.nextInt();
		    Arrays.sort(coin);
		    System.out.println(countCombinations(amt,coin,coin.length-1,new int[amt+1][coin.length+1]));
		}
	}
	public static int countCombinations(int amt, int[] coin,int m, int[][] qb)
	{
	   if(amt == 0)
	    {
	        return 1;
	    }
	   if(amt<0 || m<0)
	   return 0;
	   if(qb[amt][m]>0)
	   return qb[amt][m];
	    
	    
	        
	   qb[amt][m]= countCombinations(amt-coin[m],coin,m,qb)+countCombinations(amt,coin,m-1,qb);
	    return qb[amt][m];	}
}
