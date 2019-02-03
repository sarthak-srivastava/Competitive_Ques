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
	     int m = sc.nextInt();
	     int n =sc.nextInt();
	     int[][] arr = new int[m][n];
	     for(int i = 0;i<m;i++)
	     {
	         for(int j = 0;j<n;j++)
	         arr[i][j] = sc.nextInt();
	     }
	     int dir = 0;
	     int left = 0;
	     int right = arr[0].length-1;
	     int top = 0;
	     int bottom = arr.length-1;
	     while(top<=bottom && left<=right)
	     {
	         if(dir == 0)
	         {
	             for(int i = left;i<=right;i++)
	             System.out.print(arr[top][i]+" ");
	             dir = (dir+1)%3;
	             top++;
	         }
	          if(dir == 1)
	         {
	             for(int i = top;i<=bottom;i++)
	             System.out.print(arr[i][right]+" ");
	             dir = (dir+1)%3;
	             right--;
	         }
	          if(dir == 2)
	         {
	             for(int i = right;i>=left;i--)
	             System.out.print(arr[bottom][i]+" ");
	             dir = (dir+1)%3;
	             bottom--;
	         }
	          if(dir == 3)
	         {
	             for(int i = bottom;i>=top;i--)
	             System.out.print(arr[i][left]+" ");
	             dir = (dir+1)%3;
	             left++;
	         }
	     
	         
	     }
	     System.out.println();
	 }
	 }
}
