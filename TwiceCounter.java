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
	     String[] arr = new String[n];
	     HashMap<String,Integer> hs = new HashMap<String,Integer>();
        //  HashSet<String> ts = new HashSet<String>();
	     int c = 0;
	     for(int i = 0; i<n;i++)
	     {arr[i] = sc.next();
	         if(!hs.containsKey(arr[i]))
	         hs.put(arr[i],1);
	         else{
	         hs.put(arr[i],hs.get(arr[i])+1);
	         }
	     }
	     for(Map.Entry<String,Integer> entry: hs.entrySet())
	     {if(entry.getValue() == 2)
	     c++;
	     }
	     System.out.println(c);
	 }
	 }
}
