class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        int dir = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        int size = matrix.length * matrix[0].length;
        int c= 0;
        while(left<=right && top<=bottom && c<size)
        {   c++;
            if(dir == 0)
            {
                for(int i = left;i<=right;i++)
                {
                    ans.add(matrix[top][i]);
                }
                top++;
            }
            if(dir == 1)
            {
                for(int i = top;i<=bottom;i++)
                    ans.add(matrix[i][right]);
                right--;
            }
            if( dir == 2)
            {
                for(int i = right;i>=left;i--)
                ans.add(matrix[bottom][i]);
                bottom--;
            }
            if(dir == 3)
            {
                for(int i = bottom;i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
            }
         dir = (dir+1)%4;
        }
        return ans;
    }
}
