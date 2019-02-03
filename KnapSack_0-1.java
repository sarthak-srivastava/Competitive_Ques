import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
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
		  //  int[][] dp = new int[n+1][w+1];
		    
		    System.out.println(MaxVal(n,w,val,weight));
		}
	}
	public static int MaxVal(int n,int W, int[] val, int[] wt)
	{   
	       int i, w; 
     int K[][] = new int[n+1][W+1]; 
       
     // Build table K[][] in bottom up manner 
     for (i = 0; i <= n; i++) 
     { 
         for (w = 0; w <= W; w++) 
         { 
             if (i==0 || w==0) 
                  K[i][w] = 0; 
             else if (wt[i-1] <= w) 
                   K[i][w] = Integer.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
             else
                   K[i][w] = K[i-1][w]; 
         } 
      } 
       
      return K[n][W];
	}
}
