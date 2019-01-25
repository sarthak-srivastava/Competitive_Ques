/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class KnapSackDP {
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
		    int[][] dp = new int[n+1][w+1];
		    
		    System.out.println(MaxVal(n,w,val,weight,0,dp));
		}
	}
	public static int MaxVal(int n,int w, int[] val, int[] weight,int v,int[][] dp)
	{   if(n<=0 || w<=0)
	    return 0;
	    
	    if(dp[n][w]!=0)
        return dp[n][w];
        if(w>weight[n-1])
	    dp[n][w] = Integer.max(val[n-1]+MaxVal(n-1,w-weight[n-1],val,weight,v,dp),MaxVal(n-1,w,val,weight,v,dp));
        else
        dp[n][w] = MaxVal(n-1,w,val,weight,v,dp);
	    return dp[n][w];
	}
}