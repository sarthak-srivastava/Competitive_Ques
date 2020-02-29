public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max_local = 0;
        int max_global = Integer.MIN_VALUE;
        for(int i = 0; i<A.size(); i++)
        {
            
            max_local = max_local + A.get(i);
            if(max_local > max_global)
            max_global = max_local;
            if(max_local < 0)
            max_local = 0;
        }
        if(max_local > max_global)
            max_global = max_local;
        return max_global;
    }
}
