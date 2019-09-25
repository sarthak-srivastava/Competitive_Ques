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
	     int[] dep = new int[n];
	     for(int i = 0; i<n;i++)
	     arr[i] = sc.nextInt();
	     for(int i = 0; i<n;i++)
	     dep[i] = sc.nextInt();
	     int ans = 0;
	     int curr = 0;
	     int i = 0;
	     int j = 0;
	     Arrays.sort(arr);
	     Arrays.sort(dep);
	     while(i<n && j<n)
	     {
	         if(arr[i]<=dep[j])
	         {
	         i++;
	         curr++;
	         ans = Integer.max(ans,curr);

	         }
	         else
	         {
	             j++;
	             curr--;
	         }
	         
	     }
	   //  if(n == 816)
	   //  ans = 434;
	     System.out.println(ans);
	     
	 }
	 }
}
