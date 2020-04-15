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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals == null)
        return new ArrayList<Interval>();
        if(intervals.size() <= 1)
            return intervals; 
        Collections.sort(intervals, new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });
    int i = 0;
    ArrayList<Interval> merged = new ArrayList<Interval>();
    Interval curr = intervals.get(0);
    while(i<intervals.size())
    {
        Interval tmp = intervals.get(i);
       if(merged.size() == 0 || merged.get(merged.size() - 1).end < tmp.start)
       merged.add(tmp);
       else
       merged.get(merged.size() - 1).end = Integer.max(merged.get(merged.size() - 1).end, tmp.end);
        i++;
        
    }
    return merged;
}
}
