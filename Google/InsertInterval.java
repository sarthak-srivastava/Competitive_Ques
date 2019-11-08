class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       
        ArrayList<int[]> ans = new ArrayList<>();
        int[] interval = new int[2];
        if(intervals == null || intervals.length == 0)
        {
            ans.add(newInterval);
            return ans.toArray(new int[ans.size() - 1][]);
        }
        Arrays.sort(intervals,(a,b) -> (a[0] - b[0]));
        // interval = intervals[0];
        // if(newInterval[1]<intervals[0][0])
        // {       
        //         ans.add(newInterval);
        //         newInterval[0] = Integer.MAX_VALUE;
        //         newInterval[1] = Integer.MIN_VALUE;
        // }
        int i = 0;
        while(i<intervals.length && intervals[i][1]<newInterval[0])
        {
            // interval = intervals[i];
            ans.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && (intervals[i][0] <=newInterval[1] || intervals[i][0] == newInterval[1]))
        {
            newInterval[0] = Integer.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Integer.max(newInterval[1],intervals[i][1]);
            i++;
        }
        // if(i<intervals.length && intervals[0] == newInterval[1])
        // {
        //     newInterval[0] = Integer.min(newInterval[0],intervals[i][0]);
        //     newInterval[1] = Integer.max(newInterval[1],intervals[i][1]);
        //     i++;    
        // }
        ans.add(newInterval);
        while(i<intervals.length)
        {
            interval = intervals[i++];
            ans.add(new int[]{interval[0],interval[1]});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
