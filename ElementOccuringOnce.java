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
		    int sum = 0;
		    int hsum = 0;
		    for(int i = 0; i<n;i++)
		    {arr[i] = sc.nextInt();
		     sum+=arr[i];
		     if(i%2==0)
		     hsum += 2*arr[i];
		    }
		    System.out.println(hsum-sum);
		}
	}
}
