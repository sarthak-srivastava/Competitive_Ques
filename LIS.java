import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc= new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     int[] lis = new int[n];
	     for(int i =0;i<n;i++)
	     {   arr[i] = sc.nextInt();
	         lis[i] = 1;
	     }
	     int max = Integer.MIN_VALUE;
	     for(int i = 1;i<n;i++)
	     {
	         for(int j = 0; j<i;j++)
	         {
	             if(arr[i]>arr[j] && lis[i]<=lis[j])
	             lis[i] = lis[j] + 1;
	             if(lis[i]>max)
	             max = lis[i];
	         }
	     }
	     System.out.println(max);
	 }
	 }
}
