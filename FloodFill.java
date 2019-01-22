/*   
Given a 2D screen, location of a pixel in the screen ie(x,y) and a color(K), your task is to replace color of the given pixel and all adjacent(excluding diagonally adjacent) same colored pixels with the given color K.

Example:

                                {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 2, 2, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 2, 2, 0},
                      {1, 1, 1, 1, 1, 2, 1, 1},
                      {1, 1, 1, 1, 1, 2, 2, 1},
                      };

                        x=4, y=4, color=3 

                               {{1, 1, 1, 1, 1, 1, 1, 1},
                     {1, 1, 1, 1, 1, 1, 0, 0},
                     {1, 0, 0, 1, 1, 0, 1, 1}, 
                     {1, 3, 3, 3, 3, 0, 1, 0},
                     {1, 1, 1, 3, 3, 0, 1, 0},
                     {1, 1, 1, 3, 3, 3, 3, 0},
                     {1, 1, 1, 1, 1, 3, 1, 1},
                     {1, 1, 1, 1, 1, 3, 3, 1}, };


Note: Use zero based indexing.


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. The first line of each test case contains Two integers N and M denoting the size of the matrix. Then in the next line are N*M space separated values of the matrix. Then in the next line are three values x, y and K.

Output:
For each test case print the space separated values of the new matrix.

Constraints:
1<=T<=100
1<=M[][]<=100

Example:
Input:
3
3 4
0 1 1 0 1 1 1 1 0 1 2 3
0 1 5
2 2
1 1 1 1
0 1 8
4 4 
1 2 3 4 1 2 3 4 1 2 3 4 1 3 2 4
0 2 9

Output:
0 5 5 0 5 5 5 5 0 5 2 3
8 8 8 8
1 2 9 4 1 2 9 4 1 2 9 4 1 3 2 4

*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr =new int[m][n];
		for(int i = 0; i<m; i++)
		{
		    for(int j = 0; j<n;j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		int up = sc.nextInt();
		int org = arr[x][y];
		upgradeColor(arr, x, y , up, org);
			for(int i = 0; i<m; i++)
		{
		    for(int j = 0; j<n;j++)
		    {
		        System.out.print(arr[i][j] +" ");
		    }
		}
		System.out.println();
	}}
	public static void upgradeColor(int[][] arr, int x, int y, int c, int org)
	{   
	    arr[x][y] = c;
	    if((x+1)<arr.length && arr[x+1][y] == org )
	    {
	        upgradeColor(arr,x+1,y,c,org);
	    }
	    if((x-1) > 0 && arr[x-1][y] == org)
	    upgradeColor(arr,x-1,y,c,org);
	    if((y+1)<arr[0].length && arr[x][y+1] == org)
	    upgradeColor(arr,x,y+1,c,org);
	    if((y-1) > 0 && arr[x][y-1] == org)
	    upgradeColor(arr,x,y-1,c,org);
	    
	}
}
