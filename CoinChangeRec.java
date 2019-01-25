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
		    System.out.println(countCombinations(amt,coin,coin.length-1));
		}
	}
	public static int countCombinations(int amt, int[] coin,int m)
	{
	    if(amt == 0)
	    {
	        return 1;
	    }
	    if(amt<0 || m<0)
	    return 0;
	    
	    
	        
	            return countCombinations(amt-coin[m],coin,m)+countCombinations(amt,coin,m-1);
	    	}
}
