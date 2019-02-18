class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
        if(i<0)
            i = 0;
        if(j>nums.length)
            j = nums.length-1;
        int sum = 0;
        for(int k = i;k<=j;k++)
            sum+=nums[k];
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
