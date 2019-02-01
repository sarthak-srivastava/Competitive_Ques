import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc =new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0;i<n;i++)
	     arr[i] = sc.nextInt();
	     int temp = arr[k-1];
	     arr[k-1] = arr[n-k];
	     arr[n-k] = temp;
	     for(int i = 0;i<n;i++)
	     System.out.print(arr[i]+" ");
	 }
	 System.out.println();
	 }
}
