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
		    int[] arr = new int[3];
		    for(int i = 0; i<n;i++)
		    arr[sc.nextInt()]++;
		    for(int i = 0; i<3;i++)
		    {
		        while(arr[i]-->0)
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	}
}
