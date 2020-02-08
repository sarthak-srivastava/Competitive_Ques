class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<Integer>();
        int[] ans = new int[nums.length - k + 1];
        if(nums.length < k || k == 0)
        return new int[0];
        int j = 0;
        int i = 0;
        for(;i<k;i++)
        {
            while(dq.size() > 0 && nums[i] >= nums[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i<nums.length; i++)
        {
            ans[j++] = nums[dq.peek()];  
            while ((!dq.isEmpty()) && dq.peek() <= i - k) 
                dq.removeFirst();  
            while ((!dq.isEmpty()) && nums[i] >= nums[dq.peekLast()]) 
                dq.removeLast(); 
   
            dq.addLast(i); 
        }
        if(dq.size() > 0)
        ans[j++] = nums[dq.peek()];
        return ans;
    }
}
