class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int count = 0;
         for(int i:A)
        {
            if((i&1) == 0)
            {
                ans[count++] = i;
            }
        }
        for(int i:A)
        {
            if((i&1) >0)
            {
                ans[count++] = i;
            }
        }
       
        return ans;
    }
}
