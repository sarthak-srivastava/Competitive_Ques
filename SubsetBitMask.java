/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n = 4;
		int[] arr = {1,2,3,4};
		for(int i = 0; i<(1<<n); i++)
		{   System.out.print("{ ");
		    for(int j = 0; j<n;j++)
		    {
		        if((i&(1<<j)) >0)
		        System.out.print(arr[j]+" ");
		    }
		    System.out.println("}");
		}
	}
}
