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
	     Long[] arr = new Long[n];
	     for(int i = 0;i<n;i++)
	     arr[i] = sc.nextLong();
	     Stack<Long> st= new Stack<Long>();
	     for(int i = n-1;i>=0;i--)
	     {
	         while(!st.isEmpty() && st.peek()<=arr[i])
	         st.pop();
	         long q = st.isEmpty()?-1:st.peek();
	         st.push(arr[i]);
	         arr[i] = q;
	     }
	     for(int i = 0;i<n;i++)
	     System.out.print(arr[i]+" ");
	     System.out.println();
	 }
	 }
}
