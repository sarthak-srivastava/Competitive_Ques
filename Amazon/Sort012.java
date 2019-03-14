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
	 {   int n = Integer.parseInt(in.readLine());
	     
	     int[] arr = new int[3];
	     String[] s = in.readLine().split(" ");
	     for(int i = 0;i<n;i++)
	     arr[Integer.parseInt(s[i])]++;
	     for(int i=0;i<3;i++)
	     {
	         while(arr[i]-->0)
	         {
	             System.out.print(i+" ");
	         }
	     }
	     System.out.println();
	 }
	 }
}
