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
		    for(int i = 0; i<n;i++)
		    arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    int m = sc.nextInt();
		    int min = Integer.MAX_VALUE;
		    for(int i = 0; i+m-1<n;i++)
		    {
		        int temp = arr[i+m-1] - arr[i];
		        if(temp<min)
		        min = temp;
		    
		}
		System.out.println(min);
	}
}
}
