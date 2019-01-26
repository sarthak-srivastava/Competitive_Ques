{
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.HashMap;
class CountELements
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			//int k = sc.nextInt();
			
			GfG g = new GfG();
			g.countDistinct(a,k,n);			
			System.out.println();
		
		t--;
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below method */
class GfG
{
    void countDistinct(int A[], int k, int n)
    {
	// Your code here	
	int[] dca = new int[n-k+1];
	for(int i = 0; i<=(n-k);i++)
	{   int c = k;
	    int sum = A[i];
	    int prevsum = 0;
	    for(int j = 0;j<k;j++)
	    {
	        
	        if((sum - A[i+j] )==prevsum)
	        c--;
	        prevsum = sum;
	        sum += A[i+j];
	        
	    }
	    dca[i] = c+1;
	
    }
    for(int i = 0; i<dca.length;i++)
    System.out.print(dca[i]+" ");
    System.out.println();
}
}
