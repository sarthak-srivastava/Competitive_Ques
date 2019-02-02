import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  static int count = 0;
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     count = 0;
	     countNums(n,0);
	     System.out.println(count);
	 }
	 }
	 public static void countNums(int n,int nsf)
	 {  if(nsf>n)
	 {count--;
	 return;}
	     
	     for(int i = 1;i<=5;i++)
	     {      count++;
	         countNums(n,nsf*10+i);
	     
	 }
}
}
