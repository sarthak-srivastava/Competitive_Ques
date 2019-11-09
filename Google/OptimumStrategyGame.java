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
	 while(t-- >  0)
	 {
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0; i<n;i++)
	     {
	         arr[i] = sc.nextInt();
	         
	     }
	     
	     System.out.println(OptimumStrategy(arr,0,arr.length - 1, new int[arr.length+1][arr.length+1]));
	 }
	 }
	 public static int OptimumStrategy(int[] arr ,int start, int end, int sum, int[][] qb)
	 {
	     if(qb[start][end]!=0)
	        return qb[start][end];
	     if(start == end)
	     return arr[start];
	     if(start == end - 1)
	     return qb[start][end] = Integer.max(arr[start],arr[end]);
	     return qb[start][end] = Integer.max(arr[start] + Integer.min(OptimumStrategy(arr,start + 1, end - 1,qb),OptimumStrategy(arr,start+2,end,qb)), arr[end] + Integer.min(OptimumStrategy(arr,start + 1, end - 1,qb),OptimumStrategy(arr,start,end-2,qb)));
	     
	 }
	 {
	     
	 }
}
