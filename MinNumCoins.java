import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  static int c = 0;
	public static void main (String[] args)
	 {
	 //code\
	 Scanner sc = new Scanner(System.in);
	 int t= sc.nextInt();
	 while(t-->0)
	 {   c = 0;
	     int val = sc.nextInt();
	     int den = sc.nextInt();
	     int[] arr = new int[den];
	     for(int i = 0;i<den;i++)
	     arr[i] = sc.nextInt();
	     Arrays.sort(arr);
	     System.out.println(minCoins(arr,den,val));
	   //  System.out.println(c);
	 }
	 }
	 public static int minCoins(int[] coins, int m,int V)
	 {     int table[] = new int[V + 1]; 
  
        // Base case (If given value V is 0) 
        table[0] = 0; 
  
        // Initialize all table values as Infinite 
        for (int i = 1; i <= V; i++) 
        table[i] = Integer.MAX_VALUE; 
  
        // Compute minimum coins required for all 
        // values from 1 to V 
        for (int i = 1; i <= V; i++) 
        { 
            // Go through all coins smaller than i 
            for (int j = 0; j < m; j++) 
            if (coins[j] <= i) 
            { 
                int sub_res = table[i - coins[j]]; 
                if (sub_res != Integer.MAX_VALUE  
                       && sub_res + 1 < table[i]) 
                       table[i] = sub_res + 1; 
                         
                  
            } 
              
        } 
        if(table[V] == Integer.MAX_VALUE)
        return -1;
        return table[V]; 
 
	 }
}
