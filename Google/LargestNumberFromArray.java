import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     String[] arr = new String[n];
	     for(int i = 0; i<n;i++)
	     {
	         arr[i] = sc.next();
	     }
	     Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
	     String ans = "";
	     for(int i = n-1; i>=0;i--)
	     ans = ans + arr[i];
	     System.out.println(ans);
	     
	 }
	 }
}
