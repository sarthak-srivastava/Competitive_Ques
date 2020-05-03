public class Solution {
    /**
     * @param A: a array
     * @return: is it monotonous
     */
    public boolean isMonotonic(int[] A) {
        // Write your code here.
        if(A == null || A.length <= 1)
            return true;
        int flag = 0;
        for(int i = 0; i< A.length - 1; i++)
        {
            
            if(A[i] > A[i+1])
                {if(flag != 0)
                  {  if(flag == 1)
                        return false;
                  }
                else
                flag = -1;
                    
                }
                if(A[i] < A[i+1])
                {if(flag != 0)
                  {  if(flag == -1)
                        return false;
                  }
                else
                flag = 1;
                    
                }
        }
        return true;
    }
}
