import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t= sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     int sum = sc.nextInt();
	     for(int i = 0; i<n;i++)
	     arr[i] = sc.nextInt();
	     
	     int i = 0;
	     int j = 0;
	     int tsum = 0;
	     while(tsum!=sum && i<n && j<n)
	     {  while(tsum<sum && j<n){
	         tsum += arr[j++];
	     }
	     while(tsum>sum && i<n)
	     {
	         tsum -= arr[i++];
	     }
	         
	     }
	     if(tsum == sum)
	     {
	         System.out.println(Integer.toString(i+1)+' '+Integer.toString(j));
	     }
	     else
	     System.out.println(-1);
	 }
	 }
}
