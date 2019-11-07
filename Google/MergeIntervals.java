class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0)
                return intervals;
        Arrays.sort(intervals, (a,b)->a[0] - b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        int[] interval = new int[2];
        interval = intervals[0];
        for(int[] curr:intervals)
        {
            if(curr[0]<=interval[1])
                interval[1] = Integer.max(interval[1],curr[1]);
            else
            {
                ans.add(interval);
                interval = curr;
                
            }
        }
        ans.add(interval);
        
        return ans.toArray(new int[ans.size()][]);
    }
}
