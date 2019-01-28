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
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    arr[0] = sc.nextInt();
		    if(n==1)
		    {System.out.println(0);
		        continue;}
		    arr[1] = sc.nextInt();
		    int min_el = arr[0];
		    int max_diff = arr[1] - arr[0];
		    for(int i = 1;i<n;i++)
		    {
		        if(i>=2)
		        arr[i] = sc.nextInt();
		        if(arr[i] - min_el > max_diff)
		        max_diff = arr[i] - min_el;
		        if(arr[i]<min_el)
		        min_el = arr[i];
		        
		    }
		    System.out.println(max_diff);
		}
	}
}
