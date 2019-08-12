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
	     int mindiff = Integer.MAX_VALUE;
	     TreeSet<Integer> ts = new TreeSet<Integer>();
	     int[] arr = new int[n];
	     for(int i = 0; i<n; i++)
	     {  int num = sc.nextInt();
	         arr[i] = num;
	     }
	     Arrays.sort(arr);
	     for(int i = n-1;i>0;i--)
	     mindiff = Integer.min(arr[i] - arr[i-1],mindiff );
	     System.out.println(mindiff);
	     
	 }
	 }
}
