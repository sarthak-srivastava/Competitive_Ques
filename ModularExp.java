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
	     int c = sc.nextInt();
	     int q = a%c;
	     b--;
	     while(b-->0)
	     q = (q*a)%c;
	     System.out.println(q%c);
	 }
	 }
}
