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
	   //  int[] arr = new int[n];
	   //  for(int i = 0; i<n; i++)
	   //  arr[i] = sc.nextInt();
	     int max_global = Integer.MIN_VALUE;
	     int curr_sum = 0;
	     for(int i = 0; i<n; i++)
	     {   int temp = sc.nextInt();
	         curr_sum += temp;
	         if(curr_sum > max_global)
	         max_global = curr_sum;
	         if(curr_sum < 0)
	         curr_sum = 0;
	     }
	     System.out.println(max_global);
	 }
	 }
}
