//Missing number in array
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
	    int q = n*(n+1)/2;
	    int s = 0;
	    for(int i = 0; i <n-1; i++ )
	    {
	    s = s +  sc.nextInt();
	    }
	    System.out.println((q - s));
	}
	}
}
