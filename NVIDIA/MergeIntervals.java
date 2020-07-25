class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length < 2)
            return intervals;
        ArrayList<int[]> arr = new ArrayList<>();
        Arrays.sort(intervals, (a,b) ->(a[0] - b[0]));
        int[] interval = new int[2];
        interval = intervals[0];
        for(int i = 0; i<intervals.length; i++)
        {
            int[] curr = intervals[i];
            if(curr[0] <= interval[1]){
                interval[1] = Integer.max(interval[1],curr[1]);
            }
            else
            {
                arr.add(interval);
                interval = curr;
                
            }
                if(i == intervals.length - 1)
                arr.add(interval);
            
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
