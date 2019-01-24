import java.util.*;
public class Solution {
    public int[] prevSmaller(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> stk = new Stack<Integer>();
        int msf = Integer.MAX_VALUE;
        for(int i = 0; i<A.length;i++)
        {
            if(stk.size()==0)
            {ans[i] = -1;
            stk.push(A[i]);
            msf = A[i];
            continue;
            }
            else if(msf>A[i])
            {
                ans[i] = -1;
                msf = A[i];
                stk.push(A[i]);
                continue;
                
            }
            else
            {
                while((stk.size()>0)&&stk.peek()>=A[i])
                {
                    stk.pop();
                }
                if(stk.size()>0)
                ans[i] = stk.peek();
                else
                ans[i] = -1;
                stk.push(A[i]);
            }
            
        }
        return ans;
    }
}
