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
	     for(int i =0;i<n;i++)
	     arr[i] = sc.nextInt();
	     System.out.println(findMin(arr,0,arr.length-1));
	 }
	 }
	 public static int findMin(int[] arr,int low,int high )
	 {    if (high < low)  return arr[0]; 
  
        // If there is only one element left 
        if (high == low) return arr[low]; 
  
        // Find mid 
        int mid = (high + low)/2; /*(low + high)/2;*/
  
        // Check if element (mid+1) is minimum element. Consider 
        // the cases like {3, 4, 5, 1, 2} 
        if (mid < high && arr[mid+1] < arr[mid]) 
            return arr[mid+1]; 
  
        // Check if mid itself is minimum element 
        if (mid > low && arr[mid] < arr[mid - 1]) 
            return arr[mid]; 
  
        // Decide whether we need to go to left half or right half 
        if (arr[high] > arr[mid]) 
            return findMin(arr, low, mid-1); 
        return findMin(arr, mid+1, high); 

	 }
}
