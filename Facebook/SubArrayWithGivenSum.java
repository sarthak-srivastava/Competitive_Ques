import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc= new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     int sum =sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0; i<n; i++)
	     {
	         arr[i] = sc.nextInt();
	         
	     }
	     int flag = 0;
	     int presum = 0;
	     HashMap<Integer, Integer> hm = new HashMap<>();
	     hm.put(0, 0);
	     for(int i = 0; i< n; i++)
	     {
	         presum += arr[i];
	        if(hm.containsKey(presum - sum ))
	           {
	               flag = 1;
	               System.out.println((hm.get(presum - sum) + 1) + " " + (i+1));
	               break;
	           }
	       else
	        hm.put(presum, (i+1));
	        
	     }
	     if(flag == 0)
	        System.out.println(-1);
	     
	 }
	 }
}
