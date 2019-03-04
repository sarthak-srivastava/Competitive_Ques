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
	     String inp = sc.next();
	     for(int i = 0;i<inp.length();i++)
	     {
	         if(inp.charAt(i) == 'b')
	         {inp = inp.substring(0,i)+inp.substring(i+1);
	             i--;
	         }
	         else if(inp.charAt(i) == 'a' && (i+1)<inp.length() && inp.charAt(i+1) == 'c')
	         {inp = inp.substring(0,i)+inp.substring(i+2);
	             i--;
	         }
	         else 
	         continue;
	     }
	     System.out.println(inp);
	 }
	 
	 }
}
