public class Solution {
    public int snakeLadder(int[][] A, int[][] B) {
        HashMap<Integer, Integer> ladder = new HashMap<>();
        for(int i = 0; i< A.length; i++)
        {
            ladder.put(A[i][0], A[i][1]);
        }
        for(int i = 0; i< B.length; i++)
        {
            ladder.put(B[i][0], B[i][1]);
        }
        int[] dp = new int[101];
        int[] visited = new int[101];
        for(int i = 0; i< dp.length; i++)
            dp[i] = -1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        dp[1] = 0;
        while(q.size() > 0)
        {
            int curr = q.poll();
            visited[curr] = 1;
            for(int i = 1; i <=6; i++ )
            {
                int temp = i + curr;
                if(ladder.containsKey(temp))
                    temp = ladder.get(temp);
                if(temp <= 100 && dp[temp] == -1)
                {   if(visited[temp] != 1)
                        q.add(temp);
                    dp[temp] = 1 + dp[curr]; 
                    if(temp == 100)
                        return dp[temp];
                }
            }
        }
        return -1;
    }
}
