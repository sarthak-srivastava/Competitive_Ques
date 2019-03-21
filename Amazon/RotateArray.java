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
	     for(int i = 0; i<n;i++)
	     arr[i] = sc.nextInt();
	     int d = sc.nextInt();
	     int[] temp = new int[d];
	     int q = 0;
	     for(int i = 0;i<d;i++)
	     temp[i] = arr[i];
	     for(int i = 0; i<n-d;i++)
	     arr[i] = arr[i+d];
	     q = 0;
	     for(int i = n-d; i<n;i++)
	     arr[i] = temp[q++];
	     for(int i = 0;i<n;i++)
	     System.out.print(arr[i]+" ");
	     System.out.println();
	 }
	 }
}
