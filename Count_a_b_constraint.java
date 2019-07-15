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
	     int arr[][][] = new int[n+1][2][3];
	     for(int i = 0;i<=n;i++)
	     {for(int b = 0; b<2;b++)
	         {for(int c = 0;c<3;c++)
	         arr[i][b][c] = -1;}
	     }
	     System.out.println(PrintCombos(n,1,2,arr));
	 }
	 }
	 public static int PrintCombos(int n, int b, int c,int[][][] arr)
	 {

	     if(b<0 || c<0)
	     return 0;
	     if(n == 0)
	     return 1;
	     if(b == 0 && c == 0)
	     return 1;
	     if(arr[n][b][c]!=-1)
	     return arr[n][b][c];
	     return (arr[n][b][c] = PrintCombos(n-1,b,c,arr)+PrintCombos(n-1,b-1,c,arr)+PrintCombos(n-1,b,c-1,arr));
	 }
}
