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
	     int s = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0;i<n;i++)
	     arr[i] = sc.nextInt();
	     int si = 0;
	     int ei = 0;
	     int sum = 0;
	   //  int sum = arr[si];
	     while(sum<s && ei<n){
	         while(sum<s && ei<n)
	         {
	             sum += arr[ei++];
	         }
	         while(sum>s && si<n)
	         {
	             sum -= arr[si++];
	         }
	     }
	     if(si<=ei && sum == s)
	     System.out.println((si+1)+" "+ei);
	     else
	     System.out.println(-1);
	 }
	 }
}
