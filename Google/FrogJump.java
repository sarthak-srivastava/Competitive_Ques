class Solution {
    public boolean canCross(int[] stones) {
        if(stones == null || stones.length<=1 || stones[1]!=1)
            return false;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<stones.length; i++)
        {
            hs.add(stones[i]);
        }
        HashMap<String,Boolean> dp = new HashMap<>();
        return dfs(stones,1,1,hs,dp);
    }
    public boolean dfs(int[] stones, int stoneNumber, int prevJump,HashSet<Integer> hs,HashMap<String,Boolean> dp)
    {   if(prevJump <= 0 || stoneNumber > stones[stones.length - 1])
            return false;
        if(stoneNumber == stones[stones.length - 1])
            return true;
        boolean ans = false;
     String key = Integer.toString(stoneNumber) + ' ' + Integer.toString(prevJump);
     if(dp.containsKey(key))
         return dp.get(key);
        if(!hs.contains(stoneNumber + prevJump) && !hs.contains(stoneNumber + prevJump -1 ) && !hs.contains(stoneNumber + prevJump + 1))
            return false;
        if(hs.contains(stoneNumber + prevJump))
            ans = ans || dfs(stones,stoneNumber + prevJump,prevJump,hs,dp);
        if(hs.contains(stoneNumber + prevJump - 1))
            ans = ans || dfs(stones,stoneNumber + prevJump - 1,prevJump - 1,hs,dp);
        if(hs.contains(stoneNumber + prevJump + 1))
            ans = ans || dfs(stones,stoneNumber + prevJump+1,prevJump+1,hs,dp);
        dp.put(key,ans);
        return ans;
    }
    class pair{
        int stoneNumber;
        int prevJump;
        public pair(int s, int p)
        {
            stoneNumber = s;
            prevJump = p;
        }
    }
}
