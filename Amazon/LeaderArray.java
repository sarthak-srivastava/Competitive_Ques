import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int t = Integer.parseInt(in.readLine());
	 while(t-->0)
	 {   int n = Integer.parseInt(in.readLine());
	     String[] str = in.readLine().split(" ");
	     int[] arr = new int[n];
	     int maxsofar = Integer.MIN_VALUE;
	     String ans = "";
	     for(int i = n-1;i>=0;i--)
	     {
	         arr[i] = Integer.parseInt(str[i]);
	         if(arr[i]>=maxsofar)
	         {
	             ans = Integer.toString(arr[i])+" "+ans;
	             maxsofar = arr[i];
	         }
	     }
	     System.out.println(ans);
	 }
	 }
}
