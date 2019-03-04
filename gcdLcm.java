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
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     if(a<b)
	     {
	         int q = b;
	         b = a;
	         a = q;
	     }
	     int gcd = gcdutil(a,b);
	     
	     System.out.println((a*b)/gcd+" "+gcd);
	 }
	 }
	 public static int gcdutil(int a, int b)
	 {
	     if( b == 0)
	     return a;
	     return gcdutil(b,a%b);
	 }
}
