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
	     int[][] arr = new int[r][c];
	     for(int i = 0;i<r;i++)
	     {
	         for(int j = 0;j<c;j++)
	         arr[i][j] = sc.nextInt();
	     }
	     int key = sc.nextInt();
	     int i = 0;
	     int j = c-1;
	     int flag = 0;
	     while(i<r && j>=0)
	     {
	         if(arr[i][j] == key)
	         {  flag = 1;
	             System.out.println(1);
	             break;
	         }
	         else if(arr[i][j]>key)
	         {
	             j--;
	         }
	         else
	         i++;
	     }
	     if(flag == 0)
	     System.out.println(0);
	 }
	 }
}
