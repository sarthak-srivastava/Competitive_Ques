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
	     int r = sc.nextInt();
	     int c = sc.nextInt();
	     char[][] arr = new char[r][c];
	     for(int i = 0;i<r;i++)
	     {   String a= sc.next();
	         for(int j = 0;j<c;j++)
	         {
	             
	             arr[i][j] = a.charAt(j);
	         }
	     }
	     System.out.println(NumOfIsland(arr));
	     
	 }
	 }
	 public static int NumOfIsland(char[][] arr)
	 {   int ans = 0;
	     for(int i = 0;i<arr.length;i++)
	     {
	         for(int j = 0;j<arr[0].length;j++)
	         {
	             if(arr[i][j] == 'X')
	             {
	                 IslandUtil(arr,i,j);
	                 ans++;
	             }
	         }
	     }
	     return ans;
	 }
	 public static void IslandUtil(char[][] arr, int i, int j)
	 {   if(i>=arr.length || j>=arr[0].length || i<0 || j<0)
	        return;
	     if(arr[i][j] == 'X')
	     {  arr[i][j] = 'O';
	        
	        IslandUtil(arr,i+1,j);
	        IslandUtil(arr,i,j+1);
	        IslandUtil(arr,i-1,j);
	        IslandUtil(arr,i,j-1);
	        
	     }
	 }
}
