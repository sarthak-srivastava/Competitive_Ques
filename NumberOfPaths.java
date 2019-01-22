/*
The problem is to count all the possible paths from top left to bottom right of a  MxN matrix with the constraints that from each cell you can either move to right or down.

Input:
The first line of input contains an integer T, denoting the number of test cases.
The first line of each test case is M and N, M is number of rows and N is number of columns.

Output:
For each test case, print the number of paths.

Constraints:

1 ≤ T ≤ 30
1 ≤ M,N ≤ 10

Example:
Input
2
3 3
2 8
Output
6
8
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
		while(t-->0)
		{
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    System.out.println(CountBoardPath(0,0,m-1,n-1,0));
		}
	}
	public static int CountBoardPath(int sr, int sc, int dr, int dc, int count)
	{
	    if(sr == dr && sc == dc)
	    {
	        count++;
	        return count;
	    }
	    int r = 0;
	    int c = 0;
	    if((sr+1)<=dr)
	    r = CountBoardPath(sr+1,sc,dr,dc,count);
	    if((sc+1)<=dc)
	    c = CountBoardPath(sr,sc+1,dr,dc,count);
	    return r+c+count;
	}
}
