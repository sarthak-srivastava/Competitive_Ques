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
	     int wl = sc.nextInt();
	     int[] val = new int[n];
	     int[] wt = new int[n];
	     for(int i = 0;i<n;i++)
	     {
	         val[i] = sc.nextInt();
	     }
	     
	     for(int i = 0;i<n;i++)
	     {
	         wt[i] = sc.nextInt();
	     }
	     System.out.println(knapsackdp(n,val,wt,wl,new int[wl+1]));
	 }
	 }
	 public static int knapsackdp(int n, int[] val, int[] wt, int wl, int[] qb)
	 {
	      for(int i = 0; i <= wl; i++){ 
            for(int j = 0; j < n; j++){ 
                if(wt[j] <= i){ 
                    qb[i] = Integer.max(qb[i], qb[i - wt[j]] +  
                                val[j]); 
                } 
            } 
        } 
        return qb[wl]; 
	 }
}
