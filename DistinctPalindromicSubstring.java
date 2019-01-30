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
	 String str = sc.next();
	 HashSet<String> hs = new HashSet<String>();
	 int counter = 0;
	 boolean[][] qb = new boolean[str.length()][str.length()];
	 for(int diag = 0;diag<str.length();diag++)
	 {
	     int si = 0;
	     int ei =diag;
	     while(ei<str.length())
	     {
	         if(si==ei)
	         {
	             qb[si][ei] = true;
	         }
	         else if(ei == si+1)
	         {
	             if(str.charAt(si) == str.charAt(ei))
	             {qb[si][ei] = true;
	                 if(!hs.contains(str.substring(si,ei+1)))
	             {
	                 hs.add(str.substring(si,ei+1));
	                 counter++;
	             }
	                 
	             }
	         }
	         else
	         {
	               if(str.charAt(si) == str.charAt(ei) && qb[si+1][ei-1]==true)
	             {      qb[si][ei] = true;
	                 if(!hs.contains(str.substring(si,ei+1)))
	             {
	                 hs.add(str.substring(si,ei+1));
	                 counter++;
	             }
	                 
	             }
	         }
	    si++;
	    ei++;
	    }
	}
	 System.out.println(counter);
	 }
}
