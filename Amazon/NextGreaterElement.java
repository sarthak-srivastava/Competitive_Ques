class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int k = 0;
        for(int n: nums1){
            hs.put(n,k++);}
        Stack<Integer> stk = new Stack<>();
        for(int i = nums2.length-1; i>=0; i--)
        {
            while(stk.size() >0 && stk.peek() < nums2[i])
                stk.pop();
            if(hs.containsKey(nums2[i]))
                nums1[hs.get(nums2[i])] = stk.size() == 0 ? -1 : stk.peek();
            stk.push(nums2[i]);
        }   
         return nums1;   
    }
}
