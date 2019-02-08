public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int num = 0;
        for(int i =1; i<A.length;i++)
        {num = A[i]^A[i-1];}
        return num;
    }
}
