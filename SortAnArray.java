class Solution {
    public List<Integer> sortArray(int[] nums) {
        // List<Integer> ans;
        if(nums == null || nums.length == 0)
            return new ArrayList<Integer>();
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for(int i : nums)
            ans.add(i);
        return ans;
    }
}
