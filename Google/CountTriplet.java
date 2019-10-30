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
	     int s= sc.nextInt();
	     int[] arr = new int[s];
	     HashSet<Integer> hs = new HashSet<Integer>();
	     for(int i = 0; i<s;i++){
	     arr[i] = sc.nextInt();
	     hs.add(arr[i]);
	     }
	     int ans = 0;
            
	     for(int i = 0; i<s;i++)
	     {
	         for(int j = i+1;j<s;j++)
	         {
	             if(hs.contains(arr[i]+arr[j]))
	             ans++;
	         }
	     }
	     if(ans == 0)
	     System.out.println(-1);
	     else
	     System.out.println(ans);
	     
	 }
	 }
}
