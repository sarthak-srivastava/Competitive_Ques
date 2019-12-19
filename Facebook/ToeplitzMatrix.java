class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean result = true;
        for(int i = matrix.length- 1; i>=0;i--)
        {
            int el = matrix[i][0];
            // System.out.println(el);
            int c = 0;
            for(int j = i;j<matrix.length && c < matrix[0].length;j++)
            {
                // System.out.print(matrix[j][j] + " ");
                if(matrix[j][c++]!=el)
                    return false;
            }
            // System.out.println();
        }
        for(int i = 1; i<matrix[0].length;i++)
        {
            int el = matrix[0][i];
            // System.out.println(el);
            int r = 0;
            for(int j = i;j<matrix[0].length && r < matrix.length;j++)
            {
                // System.out.print(matrix[j][j] + " ");
                if(matrix[r++][j]!=el)
                    return false;
            }
            // System.out.println();
        }
        return true;
    }
}
