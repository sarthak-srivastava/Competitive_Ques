class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0)
            return 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : tasks)
        {
            hm.put(ch,hm.getOrDefault(ch,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (b-a));
        pq.addAll(hm.values());
        int intervals = 0;
        while(pq.size()>0)
        {
            List<Integer> tasklist = new ArrayList<>();
            for(int i = 0; i<=n; i++)
            {
                if(pq.size()>0)
                    tasklist.add(pq.remove());
            }
            
            for(int i: tasklist)
            {   if(i-1>0)
                pq.add(i - 1);
            }
             intervals += (pq.size() == 0)?tasklist.size() : n + 1;

        }
        return intervals;
    }
}
