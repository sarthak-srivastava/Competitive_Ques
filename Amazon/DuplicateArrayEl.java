public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int n = a.size()-1;
        int hyp_sum = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i<n+1;i++)
        sum += a.get(i);
        return sum-hyp_sum;
    }
}
