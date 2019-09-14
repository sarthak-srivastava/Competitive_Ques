class Solution {
    public int[] dailyTemperatures(int[] T) {
        if(T == null || T.length == 0)
            return T;
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[T.length];
        for(int i = T.length-1;i>=0;i--)
        {
            if(i==T.length - 1)
                ans[i] = 0;
            else
            {
                while(stk.size()!=0 && T[stk.peek()]<=T[i])
                {
                    stk.pop();
                }
                if(stk.size()!=0)
                {
                    ans[i] = stk.peek() - i;
                }
                else
                {
                    ans[i] = 0;
                }
            }
            stk.push(i);
            
        }
        return ans;
    }
}
