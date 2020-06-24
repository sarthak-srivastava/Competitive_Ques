public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the product of all the elements of nums except nums[i].
     */
    public int[] productExceptSelf(int[] nums) {
        // write your code here
        int[] prod = new int[nums.length];
        int[] pre = new int[nums.length];
        pre[0] = 1;
        int[] post = new int[nums.length];
        post[post.length - 1] = 1;
        for(int i = 1; i<nums.length; i++)
        {
            pre[i] = pre[i - 1] * nums[i-1];
        }
        for(int i = nums.length - 2; i>=0; i--)
        {
            post[i] = post[i+1] * nums[i+1];
        }
        for(int i = 0; i<nums.length; i++)
        nums[i] = pre[i] * post[i];
        return nums;
    }
}
