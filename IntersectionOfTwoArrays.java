class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Set<Integer> ans = new HashSet<>();
        Set<Integer> num1 = new HashSet<>();
        for(int i: nums1)
            num1.add(i);
        for(int i: nums2)
        {
            if(num1.contains(i))
                ans.add(i);
        }
        int[] ans_arr = new int[ans.size()];
        int i = 0;
        for(int num: ans)
        {
            ans_arr[i++] = num;
        }
        return ans_arr;
    }
}
