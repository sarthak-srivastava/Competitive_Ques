class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        ArrayList<Integer>[] cost = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
            cost[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < times.length; i++)
        {
            adj[times[i][0]-1].add(times[i][1]-1);
            cost[times[i][0]-1].add(times[i][2]);
        }
        int ans = Integer.MIN_VALUE;
        return distance(adj, cost, k-1);
    }
    private static int distance(ArrayList<Integer>[] adj, ArrayList<Integer>[] cost, int s) {
        int[] dist = new int[adj.length];
		for (int i = 0;i < dist.length;i++) {
            dist[i] = Integer.MAX_VALUE;
        }
		dist[s] = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b) -> dist[a] - dist[b]);
		queue.add(s);
		while(!queue.isEmpty()){
			int curr = queue.remove();
			for (int q = 0; q < adj[curr].size(); q++) {
                int v = adj[curr].get(q);
				if (dist[v] > dist[curr] + cost[curr].get(q)) {
                    dist[v] = dist[curr] + cost[curr].get(q);
                    queue.add(v);
                }
			}
		}
        int ans = Integer.MIN_VALUE;
        for(int i: dist)
        {
            ans = Integer.max(ans, i);
        }
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
