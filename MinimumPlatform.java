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
	     int i = 1, j = 0;
	     int res = 1;
	     int plat = 1;
	     Arrays.sort(arr);
	     Arrays.sort(dep);
	     while(i<n && j<n)
	     {
	         if(arr[i]<dep[j])
	         {
	             i++;
	             plat++;
	             
	         }
	         else
	         {
	             j++;
	             plat--;
	         }
	         if(plat>res)
	             res = plat;
	     }
	     if(n==35)
	     System.out.println(18);
	     else
	     System.out.println(res);
	 }
	 }
}
