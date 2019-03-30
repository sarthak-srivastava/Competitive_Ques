public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int sum_so_far = A[0];
        int glob_max = Integer.MIN_VALUE;
        int min = A[0];
        for(int i = 1; i<A.length;i++)
        {   if(A[i]>min)
            min = A[i];
            sum_so_far = sum_so_far+A[i];
            if(sum_so_far>glob_max)
            glob_max = sum_so_far;
            if(sum_so_far<0 && i<A.length-1)
            sum_so_far = 0;
            
        }
        glob_max = Math.max(glob_max,min);
        return glob_max;
        
    }
}
