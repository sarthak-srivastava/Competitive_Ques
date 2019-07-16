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
	     for(int i=0;i<n;i++)
	     arr[i] = sc.nextInt();
	     int k = sc.nextInt();
	     Arrays.sort(arr);
	     System.out.println(arr[k-1]);
	 }
	 }
}
