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
	     int target = sc.nextInt();
	     int[] arr = new int[n];
	     HashMap<Integer, Integer> hm = new HashMap<>();
	     int sum = 0;
	     List<Integer> ans = new ArrayList<>();
	     hm.put(0, 0);
	     for(int i = 0; i<n; i++)
	     {
	         arr[i] = sc.nextInt();
	         
	         sum += arr[i];
	         
	         hm.put(sum, i + 1);
	         if(hm.containsKey(0 - target + sum))
	         {
	             ans.add(hm.get(0 - target + sum) + 1);
                 ans.add(i + 1);
                 
	         }
	         
	     }
	     if(ans.size() > 0)
	     {
	         System.out.println(ans.get(0) + " " + ans.get(1));
	     }
	     else
	     {
	         System.out.println(-1);
	     }
	     
	     
	 }
	 }
}
