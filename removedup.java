{
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;
class Delete_Duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i=0; i<N; i++)
				a[i] = sc.nextInt();
			
			GfG g = new GfG();
			int n = g.remove_duplicate(a);
			
			for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
			
			System.out.println();
			
		T--;
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int a[])
	{
		// Your code here
		HashSet<Integer> hs = new HashSet<Integer>();
		int i = 0;
		for(int j = 0;j<a.length;j++)
		{
		    if(!hs.contains(a[j]))
		    {
		        a[i] = a[j];
		        hs.add(a[j]);
		        i++;
		    }
		    
		}
		
		return i;
	}
}
