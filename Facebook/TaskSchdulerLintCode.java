public class Solution {
    /**
     * @param tasks: the given char array representing tasks CPU need to do
     * @param n: the non-negative cooling interval
     * @return: the least number of intervals the CPU will take to finish all the given tasks
     */
    public int leastInterval(char[] tasks, int n) {
        // write your code here
        int ans = 0;
        if(tasks == null)
            return ans;

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: tasks)
        {
            hm.put(ch, hm.getOrDefault(ch,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));
        
        pq.addAll(hm.values());
        while(pq.size() > 0)
        {
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i<=n; i++)
            {   if(pq.size() > 0)
                arr.add(pq.remove());
                
            }
            for(int i: arr)
            {
                if(i-1 > 0)
                    pq.add(i - 1);
            }
            ans += (pq.size() == 0) ? arr.size() : n + 1;
        }
        return ans;
    }
}
