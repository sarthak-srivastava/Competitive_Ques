/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
		    arr[i] = sc.nextInt();
		}
		Stack<Integer> s = new Stack<>(); 
        int nge[] = new int[arr.length]; 
  
        for (int i = arr.length - 1; i >= 0; i--) { 
              
           
            if (!s.empty()) { 
                while (!s.empty() && s.peek() <= arr[i]) { 
                    s.pop(); 
                } 
            } 
            nge[i] = s.empty() ? -1 : s.peek(); 
            s.push(arr[i]); 
  
        } 
        for(int i = 0; i < arr.length; i++)  
        System.out.print( nge[i]+" "); 
		System.out.println();
		
	}
}
}
