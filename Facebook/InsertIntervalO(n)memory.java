/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        List<Interval> ans = new ArrayList<>();
        if(intervals.size() == 0)
        {
            ans.add(newInterval);
            return ans;
        }
        int i = 0;
        int flag = 0;
        while(i < intervals.size())
        {
            Interval curr = intervals.get(i);
            if(curr.end < newInterval.start)
            {
                ans.add(curr);
                i++;
                continue;
            }
            else if(curr.start > newInterval.end)
            {   flag = 1;
                ans.add(newInterval);
                ans.add(curr);
                i++;
                break;
            }
            else
            {
                newInterval.start = Integer.min(curr.start, newInterval.start);
                newInterval.end = Integer.max(curr.end, newInterval.end);
                i++;
                continue;
            }
        }
        if(flag == 0)
            ans.add(newInterval);
        while(i<intervals.size())
        {   Interval curr = intervals.get(i);
            ans.add(curr);
        }
        return ans;
    }
}
