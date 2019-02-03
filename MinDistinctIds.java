import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry; 
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
	     int max = Integer.MIN_VALUE;
	     for(int i = 0;i<n;i++){
	     arr[i] = sc.nextInt();
	         max = Integer.max(max,arr[i]);
	     }
	     int m = sc.nextInt();
	     int[] freq = new int[max+1];
	     for(int i = 0;i<n;i++)
	     {
	         freq[arr[i]]++;
	     }
	     for(int i = 0;i<freq.length;i++)
	     {
	         if(freq[i]>m)
	         freq[i]-=m;
	         else
	         {   m -=freq[i];
	             freq[i] = 0;
	         }
	     }
	     int count = 0;
	     for(int i = 0;i<freq.length;i++)
	     {
	         if(freq[i]>0)
	         count++;
	     }
	     System.out.println(count);
	 }
	 }
}
