import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     String str = sc.next();
	     
	     boolean[][] qb = new boolean[n][n];
	     int counter = 0;
		for(int diag=0;diag<str.length();diag++)
		{
			int si = 0;
			int ei = diag;
			while(ei<str.length())
			{
				if(diag == 0)
					qb[si][ei] = true;
				else if (diag == 1)
				{
					if(str.charAt(si)==str.charAt(ei))
				    {		qb[si][ei] = true;
				            counter++;}
				}
				else
				{
					if(str.charAt(si) == str.charAt(ei) && qb[si+1][ei-1] == true)
					{
						qb[si][ei] = true;
						counter++;
					}
				}
		
			si++;
			ei++;
			}
	     
	 }System.out.println(counter);
	 }
}}
