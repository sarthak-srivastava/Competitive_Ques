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
	     int c = 0 ;
	     for(int i =1;i*i<n;i++)
	     {c++;}
	     System.out.println(c);
	 }
	 }
}
