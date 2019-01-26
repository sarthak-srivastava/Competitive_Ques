/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		//code
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		while(t-->0)
		{
		    int n = Integer.parseInt(in.readLine());
            int a = 0;
            int t1 = 0;
		    String line = in.readLine(); 
		    String[] str = line.trim().split("\\s+");
		    for(int i = 0; i<n;i++)
		    {   t1 = a;
		        a = Integer.parseInt(str[i]);
		        
		        if(i>0)
		        {if(a<t1)
		            System.out.print(a+" ");
		        else
		        System.out.print(-1+" ");
		        }
		    }
		    System.out.println(-1);
		}
	}
}
