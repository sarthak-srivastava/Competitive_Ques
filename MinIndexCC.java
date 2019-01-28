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
		    String str = sc.next();
		    String ptr = sc.next();
		    HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		    int ans = Integer.MAX_VALUE;
		    for(int i = 0; i<str.length();i++)
		    {   if(!hm.containsKey(str.charAt(i)))
		        hm.put(str.charAt(i),i);
		    }
		    for(int i = 0; i<ptr.length();i++)
		    {
		        if(hm.containsKey(ptr.charAt(i)))
		        {
		            int a = hm.get(ptr.charAt(i));
		            if(a<ans)
		            ans = a;
		        }
		    }
		    if(ans == Integer.MAX_VALUE)
		    {
		        System.out.println("No character present");
		    }
		    else
		    {
		        System.out.println(str.charAt(ans));
		    }
		}
	}
}
