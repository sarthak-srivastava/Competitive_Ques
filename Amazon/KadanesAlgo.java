import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t= sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0;i<n;i++)
	     arr[i] = sc.nextInt();
	     int curr_sum=arr[0];
	   //  int sum = arr[0];
	     int max_overall = arr[0];
	       // int curr_sum = 0;
	        for(int j = 1; j<n;j++)
	        {
	            curr_sum = Integer.max(arr[j],curr_sum+arr[j]);
	            
	            max_overall = Integer.max(curr_sum,max_overall);
	        }
	       
	        System.out.println(max_overall);
	 }
	 }
}
