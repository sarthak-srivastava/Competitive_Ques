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
	     String s1 = sc.next();
	     String s2 = sc.next();
	     
	     if(s1.length()!=s2.length())
	     {
	         System.out.println(0);
	         continue;
	     }
	     
	     int i1 = -1; int i2 = -1;
	     int c = 0;
	     for(int i = 0;i < s1.length(); i++)
	     {
	         if(s1.charAt(i)!=s2.charAt(i))
	         {
	             if(i1==-1)
	             i1 = i;
	             else
	             i2 = i;
	             c++;
	             if(c>2)
	             break;
	         }
	         
	     }
	     if(c<2 || c>2)
	         {
	             System.out.println(0);
	             continue;
	         }
	     else
	     {
	         if(s1.charAt(i1) == s2.charAt(i2) && s2.charAt(i1) == s1.charAt(i2))
	         {
	             System.out.println(1);
	         }
	         else
	         System.out.println(0);
	     }
	 }
	 }
}
