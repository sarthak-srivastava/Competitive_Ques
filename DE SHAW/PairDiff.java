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
	     int diff = sc.nextInt();
	     HashSet<Integer> hs = new HashSet<Integer>();
	     int flag = 0;
	     for(int i = 0; i<n;i++)
	     {arr[i] = sc.nextInt();
	      if(hs.contains(arr[i]+diff))
	      {System.out.println(1);
	      flag = 1;
	      }
	      else if (hs.contains(arr[i] - diff))
	      {System.out.println(1);
	      flag = 1;
	          
	      }
	      else
	      hs.add(arr[i]);
	     }
	     if(flag == 0)
	     System.out.println(-1);
	 }
	 }
}
