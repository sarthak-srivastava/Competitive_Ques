class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] memo = new int[366];
        HashSet<Integer> dayset = new HashSet<Integer>();
        for(int i = 0;i<days.length;i++)
        {
            dayset.add(days[i]);
        }
        
        return travelPlan(1,dayset,costs,memo );
    }
    public static int travelPlan(int i, HashSet<Integer> dayset, int[] costs, int[] memo)
    {
        if(i>365)
            return 0;
        if(memo[i]!=0)
            return memo[i];
        if(dayset.contains(i))
        {
            return memo[i] = Integer.min(Integer.min(travelPlan(i+1,dayset,costs,memo)+costs[0],travelPlan(i+7,dayset,costs,memo)+costs[1]),travelPlan(i+30,dayset,costs,memo)+costs[2]);
        }
        else
            return memo[i] = travelPlan(i+1,dayset,costs,memo);
    }
}
