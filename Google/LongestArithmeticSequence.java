class Solution {
    public int longestArithSeqLength(int[] A) {
     if (A.length <= 1) return A.length;
       
        int longest = 0;
        
       
        HashMap<Integer, Integer>[] dp = new HashMap[A.length];
        
        for (int i = 0; i < A.length; ++i) {
            dp[i] = new HashMap<Integer, Integer>();
        }
        
        for (int i = 1; i < A.length; ++i) {
            int x = A[i];
            for (int j = 0; j < i; ++j) {
                int y = A[j];
                int d = x - y;
           
                int len = 2;  
                
                if (dp[j].containsKey(d)) {
             
                    len = dp[j].get(d) + 1;
                }
                
             
                int curr = dp[i].getOrDefault(d, 0);
                
           
                dp[i].put(d, Math.max(curr, len));
                
                longest = Math.max(longest, dp[i].get(d));
            }
        }
        
        return longest;    
    }
}
