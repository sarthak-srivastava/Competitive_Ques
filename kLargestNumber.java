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
	     int k = sc.nextInt();
	     int[] arr = new int[n];
	   //  TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
	     for(int i = 0; i<n;i++)
	     { arr[i] = sc.nextInt();
	 }
	 Arrays.sort(arr);
	 for(int i = n-1; i>=n-k;i--)
	 System.out.print(arr[i]+" ");
	 System.out.println();
	 }
	 }
}
