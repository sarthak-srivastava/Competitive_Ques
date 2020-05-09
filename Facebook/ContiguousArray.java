public class Solution {
    /**
     * @param nums: a binary array
     * @return: the maximum length of a contiguous subarray
     */
    public int findMaxLength(int[] nums) {
        // Write your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int max = 0;
        hm.put(0,-1);
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            nums[i] = -1;
            sum += nums[i];
            if(hm.containsKey(sum))
            {
                max = Integer.max(max, i - hm.get(sum));
                
            }
            else
                hm.put(sum,i);
        }
        return max;
    }
}
