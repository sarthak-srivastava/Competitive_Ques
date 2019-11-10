class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> (-(a.x * a.x + a.y*a.y) + (b.x*b.x + b.y*b.y)));
        for(int[] point : points)
        {
            pq.add(new pair(point[0],point[1]));
            if(pq.size()>K)
                pq.remove();
        }
        int[][] ans = new int[K][2];
        int pointer = K-1;
        while(pq.size()>0)
        {
            pair p = pq.remove();
            ans[pointer][0] = p.x;
            ans[pointer][1] = p.y;
            pointer--;
        }
        return ans;
    }
    class pair
    {
        int x;
        int y;
        pair(int X,int Y)
        {
            x = X;
            y = Y;
        }
    }
}
