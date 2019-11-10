class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        int count = 0;
         for(int i:A)
        {
            if((i&1) == 0)
            {
                ans[count] = i;
                count += 2;
            }
        }
        count = 1;
        for(int i:A)
        {
            if((i&1) >0)
            {
                ans[count] = i;
                count += 2;
            }
        }
       
        return ans;
    }
}
