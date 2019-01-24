import java.util.*;
public class Solution {
    public int largestRectangleArea(int[] A) {
        Stack<Integer> stk = new Stack<Integer>();
        if(A==null || A.length == 0)
        return 0;
        int max_ar = 0;
        int i = 0;
        while(i<A.length)
        {
            if(stk.size()==0 || A[stk.peek()]<=A[i])
            {
                stk.push(i++);
            }
            else
            {
                int top = stk.pop();
                max_ar = Integer.max(max_ar,A[top]*(stk.empty()?i:i-stk.peek()-1));
                
            }
        }
        while(!stk.empty())
        {
            int top = stk.pop();
            max_ar = Integer.max(max_ar,A[top]*(stk.empty()?i:i-stk.peek()-1));
        }
        return max_ar;
    }
}
