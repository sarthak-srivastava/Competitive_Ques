/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
   
    
    Interval curr = newInterval;
    // if(curr.start > curr.end)
    // {
    //     int temp = curr.start;
    //     curr.start = curr.end;
    //     curr.end = temp;
    // }
    int i = 0;
    while(i < intervals.size())
    {   Interval tmp = intervals.get(i);
        if(tmp.end > curr.start)
        {   
            i++;
        }
        
        else if(tmp.start > curr.end)
        {
            intervals.add(i, curr);
            break;
        }
        else
        {
            curr.start = Math.min(tmp.start, curr.start);
            curr.end = Math.max(tmp.end, curr.end);
            intervals.remove(i);
        }
    }
    if(i == intervals.size())
    intervals.add(curr);
    
    return intervals;
        
    }
}




