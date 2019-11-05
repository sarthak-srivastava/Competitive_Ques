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
	     long[] arr = new long[n];
	     for(int i = 0;i<n;i++)
	     arr[i] = sc.nextInt();
	     long sum = 0;
	     for(int i = 0; i<32;i++)
	     {  int count = 0;
	         for(int j = 0;j<n;j++)
	         {
	             if((arr[j]&(1<<i))!=0)
	                count++;
	         }
	         sum += count*(n - count)*2;
	     }
	     System.out.println(sum%(1000000007));
	 }
	 }
}
