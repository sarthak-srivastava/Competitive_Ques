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
	     HashSet<Integer> hs = new HashSet<Integer>();
	     long sum = 0;
	     int rep = -1;
	     for(int i = 0;i<n;i++)
	     {arr[i] = sc.nextInt();
	      if(hs.contains(arr[i]))
	      {   rep = arr[i];
	          continue;}
	      hs.add(arr[i]);
	      sum+=arr[i];
	     }
	     	      long es = (((long)n*(long)(n+1))/2);
	     System.out.println(rep+" " +(es - sum));
	 }
	 }
}
