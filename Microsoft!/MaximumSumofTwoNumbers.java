public class Solution {
    /**
     * @param A: An Integer array
     * @return: returns the maximum sum of two numbers
     */
    public int computeSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public int MaximumSum(int[] A) {
        // write your code here
        if(A == null || A.length <=1)
            return -1;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< A.length; i++)
        {
            int temp = A[i];
            int sum = computeSum(temp);
            if(map.containsKey(sum))
            {
                ans = Integer.max(ans, temp + map.get(sum));
                map.put(sum, Integer.max(temp, map.get(sum)));
            }
            else{
                map.put(sum,temp);
            }
        }
        return ans;
    }
}
