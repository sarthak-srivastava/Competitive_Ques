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
    ArrayList<Interval> ans = new ArrayList<Interval>();
    
    for(int t = 0; t<=intervals.size()+1;t++)
    {   int i = 0;
        while(i<intervals.size()-1)
    {
        if(intervals.get(i+1).start <=intervals.get(i).end)
        {   int q;
            if(intervals.get(i).end>intervals.get(i+1).end)
            q = i;
            else
            q = i+1;
            int r;
            if(intervals.get(i).start>intervals.get(i+1).start)
            r = i+1;
            else
            r = i;
            intervals.get(i).start = intervals.get(r).start;
            intervals.get(i).end = intervals.get(q).end;
            intervals.remove(i+1);           
         }
        else
        i++;
    }
    }
    return intervals;
}
}
