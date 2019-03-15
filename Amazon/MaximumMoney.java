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
	     int m = sc.nextInt();
	     if(n%2 == 0)
	     System.out.println(n/2 * m);
	     else
	     System.out.println((n/2+1)*m);
	 }
	 }
}
