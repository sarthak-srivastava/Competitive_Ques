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
	     int[] arr = new int[n];
	     for(int i = 0;i<n;i++)
	     arr[i]= sc.nextInt();
	      for (int i = 0; i < n; i++) 
        { 
            int count = 0; 
            for (int j = i + 1; j < n; j++) 
                if (arr[j] > arr[i]) 
                    count++; 
      
            System.out.print(count +" "); 
        } 
        System.out.println();
	 }
	 }
}
