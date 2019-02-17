class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] arr = new int[nums.length];
        if(nums.length == 1)
            return nums[0];
        arr[0] = nums[0];
        arr[1] = Integer.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++)
        {
            arr[i] = Integer.max(nums[i] + arr[i-2],arr[i-1]);
            // System.out.print(arr[i]+" ");
        }
        return Integer.max(arr[nums.length-1],arr[nums.length-2]);
        
    }
}
