import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	    int n = sc.nextInt();
	    int[][] graph = new int[n][n];
	    for(int i = 0; i<n;i++)
	        for(int j = 0; j<n;j++)
	            graph[i][j] = sc.nextInt();
	    int[][] sol = new int[n][n];
	    for(int i = 0; i<n;i++)
	        for(int j = 0; j<n;j++)
	            sol[i][j] = graph[i][j];
	   for(int k = 0;k<n;k++)
	   {
	       for(int i = 0;i<n;i++)
	       {
	           for(int j = 0; j<n;j++)
	           {
	               if(sol[i][k]+sol[k][j]<sol[i][j])
	               sol[i][j] = sol[i][k]+sol[k][j];
	           }
	       }
	   }
	   for(int i = 0; i<n ;i++)
	   {
	       for(int j = 0; j<n; j++)
	       {
	           if(sol[i][j] == 10000000)
	           System.out.print("INF ");
	           else
	           System.out.print(sol[i][j]+" ");
	       }
	       System.out.println();
	   }
	 }
	 }
}
