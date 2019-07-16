{
//Code by Saksham Raj Seth
import java.util.*;
import java.lang.Math;
class Pots{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int[] a =new  int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			GfG g = new GfG();
			System.out.println(g.maxCoins(a,n));
			
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
class GfG
{
	public static int maxCoins(int A[],int N)
{
   //Your code here
   int start = 0;
   int end = N - 1;
   int[][] arr = new int[N+1][N+1];
   return maxCoinsUtil(A,start,end,arr);
}

public static int maxCoinsUtil(int A[], int start, int end, int[][] arr)
{   if(end == start+1)
        return Integer.max(A[start],A[end]);
    if(start == end)
    return A[start];
    if(arr[start][end]!=0)
    return arr[start][end];
    return arr[start][end] = Integer.max(A[start]+Integer.min(maxCoinsUtil(A,start+1,end-1,arr),maxCoinsUtil(A,start+2,end,arr)),A[end] + Integer.min(maxCoinsUtil(A,start,end -2,arr),maxCoinsUtil(A,start+1,end-1,arr)));
    
}
}
