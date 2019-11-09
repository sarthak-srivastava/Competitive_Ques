class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if(rooms == null || rooms.size() == 0)
            return true;
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stk = new Stack<>();
        visited.add(0);
        stk.push(0);
        while(stk.size()!=0)
        {
            List<Integer> keys = rooms.get(stk.pop());
            for(int room:keys)
            {
                if(!visited.contains(room))
                {   visited.add(room);
                    stk.push(room);
                }
            }
        }
        
        return visited.size() == rooms.size();
    }
}
