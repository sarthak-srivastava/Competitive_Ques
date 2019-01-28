/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		long ans = (n*(n+1)*(2*n+1))/6;
		System.out.println(ans);
		
		}
		
	}
}
