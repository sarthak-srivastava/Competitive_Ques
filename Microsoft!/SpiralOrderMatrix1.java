public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int dir = 0;
        int top = 0;
        int bottom = A.length - 1;
        int left = 0;
        int right = A[0].length - 1;
        int curr = 0;
        while(top <= bottom && left <= right)
        {
            
            if(dir == 0 && ans.size() < (A.length * A[0].length))
            {
                for(int i = left; i<=right && ans.size() < (A.length * A[0].length); i++)
                {
                    
                    ans.add(A[top][i]);
                    // System.out.println(ans.get(ans.size() -1 )+ " " + top + " " + bottom + " " + left + " " + right);
                }
                top++;
                
            }
            
            if(dir == 1 && ans.size() < (A.length * A[0].length))
            {
                for(int i = top; i<= bottom && ans.size() < (A.length * A[0].length); i++)
                {
                    ans.add(A[i][right]);
                    // System.out.println(ans.get(ans.size() -1 )+ " " + top + " " + bottom + " " + left + " " + right);
                }
                right--;
                // dir = 2;
            }

            if(dir == 2 && ans.size() < (A.length * A[0].length))
            {
                for(int i = right; i>= left && ans.size() < (A.length * A[0].length); i--)
                {
                    ans.add(A[bottom][i]);
                    // System.out.println(ans.get(ans.size() -1 )+ " " + top + " " + bottom + " " + left + " " + right);
                }
                bottom--;
                // dir = 3;
            }
            
            if(dir == 3 && ans.size() < (A.length * A[0].length) )
            {
                for(int i = bottom;i >= top && ans.size() < (A.length * A[0].length) ; i--)
                {
                    ans.add(A[i][left]);
                    // System.out.println(ans.get(ans.size() -1 ) + " " + top + " " + bottom + " " + left + " " + right);
                }
                left++;
                // dir = 0;
            }
          dir = (dir + 1)%4;
        }
        int[] ret = new int[ans.size()];
        int i = 0;
        for(int cur: ans)
        ret[i++] = cur;
        return ret;
    }
}
