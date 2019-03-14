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
	 {
	     int n = Integer.parseInt(in.readLine());
	     int[] arr = new int[n];
	     String[] str = in.readLine().split(" ");
	     for(int i = 0;i<n;i++)
	     arr[i] = Integer.parseInt(str[i]);
	     int[] lis = new int[n];
	     int ans = arr[0];
	     Arrays.fill(lis,1);
	     for(int i = 1;i<n;i++)
	     {
	         for(int j = 0;j<i;j++)
	         {
	             if(arr[j]<arr[i] && lis[j]+arr[i]>lis[i])
	             {
	                 lis[i] = lis[j]+arr[i];
	                
	             }
	         }
	          ans = Integer.max(lis[i],ans);
	       //  System.out.print(lis[i]+" ");
	     }
	     System.out.println(ans);
	 }
	 }
}
