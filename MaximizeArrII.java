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
	     int[] arr = new int[n];
	     long p = 0;
	     for(int i = 0;i<n;i++)
	     {
	         arr[i] = sc.nextInt();
	     }
	     Arrays.sort(arr);
	     for(int i = n-1 ; i>=0;i--)
	     {
	         if(arr[i]>0)
	         p+=arr[i]*i;
	     }
	     System.out.println((long)(p%(Math.pow(10,9) + 7)));
	     
	 }
	 }
}
