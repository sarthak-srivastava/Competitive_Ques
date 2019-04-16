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
	     int sum  = 0;
	     for(int i = 1;i<=n;i++)
	     {
	         sum += i*i;
	     }
	     System.out.println(sum);
	 }
	 }
}
