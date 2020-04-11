class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if(A == null || B == null || A.length!=B.length)
            return -1;
        for(int i = 1; i<= 6; i++)
        {   int countA = 0;
            int countB = 0;
            int common = 0;
            for(int j = 0; j< A.length;j++)
            {
                if(A[j] == i)
                {
                  
                    countA++;
                }
                if(B[j] == i)
                {
                  
                    countB++;
                }
                if(A[j] == i && B[j] == i)
                    common++;
                
            }
         if(countA + countB - common == A.length)
             return A.length - Integer.max(countA, countB);
        }
        return -1;
    }
}
