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
	 {   int sum = 0;
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0; i<n;i++)
	     {  
	         arr[i]=sc.nextInt();
	       //  System.out.print(arr[i]+" ");
	         sum = sum+arr[i];
	       //  System.out.print(sum+" ");
	     }
	     int esum = (n*(n+1))/2;
	     System.out.println((esum-sum));
	 }
	 }
}
