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
	 {   int l = sc.nextInt();
	     String str = sc.next();
	     int[] f = new int[256];
	     char ch = ',';
	     for(int i = str.length()-1;i>=0;i--)
	     {
	         char te = str.charAt(i);
	         if(f[te] == 0)
	         {
	         f[te]++;
	         }
	         else
	         f[te]++;
	     }
	     int flag = 0;
	     for(int i = 0; i<str.length();i++)
	     { ch = str.charAt(i);
	     if( f[ch] == 1){
	         flag = 1;
	     System.out.println(ch);
	     break;}
	     
	 }
	 if(flag == 0)
	 System.out.println(-1);
	 }
}}
