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
	    {   int s = sc.nextInt();
	        int arr[] = new int[s];
	        for(int i = 0; i<s;i++)
	        arr[i] = sc.nextInt();
	        int max_overall = arr[0];
	        int curr_sum = 0;
	        for(int j = 0; j< s;j++)
	        {
	            curr_sum = Integer.max(arr[j],curr_sum+arr[j]);
	            
	            max_overall = Integer.max(curr_sum,max_overall);
	        }
	       
	        System.out.println(max_overall);
	        
	        
	        
	        
	    }
	}
}
