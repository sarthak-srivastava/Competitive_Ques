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
		    int n = sc.nextInt();
		    int w = sc.nextInt();
		    int[] val = new int[n];
		    int[] weight = new int[n];
		    for(int i = 0;i<n;i++)
		    {
		        val[i] = sc.nextInt();
		    }
		    for(int i = 0; i<n; i++)
		    weight[i] = sc.nextInt();
		    System.out.println(MaxVal(n,w,val,weight,0));
		}
	}
	public static int MaxVal(int n,int w, int[] val, int[] weight,int v)
	{   if(n==0)
	    return 0;
	    if(w == 0)
	    return v;
	    int max = Integer.max(MaxVal(n-1,w-weight[n-1],val,weight,v+val[n-1]),MaxVal(n-1,w,val,weight,v));
	    return max;
	}
}
