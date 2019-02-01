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
	     int[] arr = new int[n];
	     int[] qb = new int[n];
	     int max = Integer.MIN_VALUE;

	     for(int i = 0;i<n;i++)
	     {
	         arr[i] = sc.nextInt();
	         qb[i] = arr[i];
	         if(qb[i]>max)
	         max = qb[i];
	         
	     }
	     for(int i = 1;i<n;i++)
	     {
	         for(int j = 0;j<i;j++)
	         {
	             if(arr[i]>arr[j] && qb[i]<qb[j]+arr[i])
	             {
	                 qb[i] =qb[j]+arr[i];
	                 
	             }
	         }
	     }
	     for(int i = 0;i<n;i++)
	     if(qb[i]>max)
	                 max = qb[i];
	     System.out.println(max);
	 }
	 }
}
