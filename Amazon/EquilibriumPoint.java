import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code
// 	 Scanner sc = new Scanner(System.in);
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int t = Integer.parseInt(in.readLine());
	 while(t-->0)
	 {
	     int n = Integer.parseInt(in.readLine());
	     int[] arr = new int[n];
	     int sum = 0;
	     String[] s = in.readLine().split(" ");
	     for(int i = 0;i<n;i++)
	     {
	         arr[i] = Integer.parseInt(s[i]);
	         sum+=arr[i];
	     }
	     int s2 = 0;
	     int i;
	     for( i = 0;i<n;i++)
	     {   if(s2 == (sum-arr[i]-s2))
	           { 
	               System.out.println(i+1);
	               break;
	           }
	         s2+=arr[i];
	         
	     }
	     if(i == n)
	     System.out.println(-1);
	 }
	 }
}
