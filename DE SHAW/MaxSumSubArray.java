public class Solution {
    
    public int solve(int[][] A, int B) {
    if(A == null)
        return 0;
    int ans = Integer.MIN_VALUE;
    int[][] sum = new int[A.length][A[0].length];
    sum[0][0] = A[0][0];
    for(int i = 1; i<A.length; i++)
        sum[i][0] = sum[i-1][0] + A[i][0];
    for(int i = 1; i<A[0].length; i++)
    {
        sum[0][i] = sum[0][i-1] + A[0][i];
    }
    for(int i = 1; i<A.length; i++)
    {
        for(int j = 1;j<A[0].length; j++)
        {
            sum[i][j] = A[i][j] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
        }
    }
    for (int i = B - 1; i < A.length; i++)
		{
			for (int j = B - 1; j < A[0].length; j++)
			{


				int total = sum[i][j];
				if (i - B >= 0) {
					total = total - sum[i - B][j];
				}

				if (j - B >= 0) {
					total = total - sum[i][j - B];
				}

				if (i - B >= 0 && j - B >= 0) {
					total = total + sum[i - B][j - B];
				}

				if (total > ans) {
					ans = total;
					
				}
			}
		}
		return ans;
    }
}
