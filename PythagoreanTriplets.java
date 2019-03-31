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
	     long[] sq = new long[n];
	     HashSet<Integer> hs = new HashSet<Integer>();
	     for(int i= 0;i<n;i++){
	     arr[i] = sc.nextInt();
	   //  sq[i] = arr[i]*arr[i];
	    hs.add(arr[i]*arr[i]);
	     }
	     int flag = 0;
	    for(int i = 0; i<n-1;i++)
	    {
	        for(int j = i+1;j<n;j++)
	        {
	            if(hs.contains(arr[i]*arr[i] + arr[j]*arr[j]))
	            {
	                System.out.println("Yes");
	                flag = 1;
	                break;
	            }
	        }
	        if(flag == 1)
	        break;
	    }
	    if(flag == 0)
	    System.out.println("No");
	    
	 }
	 }
}
