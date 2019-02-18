class Solution {
    public int removeDuplicates(int[] nums) {
        int[] n = new int[nums.length];
        HashSet<Integer> hs = new HashSet<Integer>();
        int c = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(!hs.contains(nums[i]))
            {   nums[c] = nums[i];
             // System.out.print(n[c]+" ");
                c++;
                hs.add(nums[i]);}
            
        }
        // nums = n;
        return c;
    }
}
