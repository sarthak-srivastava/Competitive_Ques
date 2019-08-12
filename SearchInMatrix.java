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
	     int m = sc.nextInt();
	     int[][] arr = new int[n][m];
	     for(int i = 0;i<n;i++)
	     {for(int j = 0; j<m;j++)
	     arr[i][j] = sc.nextInt();
	     }
	     int e = sc.nextInt();
	     int i = 0;
	     while(i<n-1 && arr[i+1][0]<=e)
	     i++;
	     int beg = 0;
	     int end = m-1;
	     while(beg<=end)
	     {
	         int mid = (end+beg)/2;
	         if(arr[i][mid] == e)
	         { 
	             System.out.println(1);
	             break;
	         
	     }
	     if(arr[i][mid]>e)
	     end = mid - 1;
	     else
	     beg = mid +1;
	 }
	 if (end<=beg)
	 System.out.println(0);
	 }
}
}
