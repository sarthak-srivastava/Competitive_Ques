/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		//code
// 		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    ArrayList<Integer> arr = new ArrayList<Integer>();
		    int j = 0;
		    for(int i = 0; i<n;i++)
		    {arr.add(sc.nextInt());
		     if(arr.get(i)%2 == 1)
		     {
		         int temp = arr.get(j);
		         arr.set(j,arr.get(i));
		         arr.set(i,temp);
		         j++;
		     }
		     Collections.sort(arr.subList(j,arr.size()));
		     Collections.sort(arr.subList(0,j), Collections.reverseOrder());
		     
		        
		    }
		    for(int i=0 ; i<n;i++)
		    System.out.print(arr.get(i) + " ");
		    System.out.println();
		}
	}
}
