public class Solution {
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        int max = 0;
        for(int i:nums)
        max = Integer.max(max, i);
        int[] buckets = new int[max+1];
        for(int i:nums)
        {
            buckets[i]++;
        }
        for(int i = buckets.length-1; i>=0; i--)
        {
            if(buckets[i] > 0)
            n -= buckets[i];
            if(n <= 0)
            return i;
        }
        return 0;
    }
}
