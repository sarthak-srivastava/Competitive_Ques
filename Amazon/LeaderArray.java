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
	     int maxsofar = Integer.MIN_VALUE;
	     String ans = "";
	     for(int i = n-1;i>=0;i--)
	     {
	         int a = Integer.parseInt(str[i]);
	         if(a>=maxsofar)
	         {
	             ans = Integer.toString(a)+" "+ans;
	             maxsofar = a;
	         }
	     }
	     System.out.println(ans);
	 }
	 }
}
