public class Solution {
    /**
     * @param ages: 
     * @return: nothing
     */
    
    public int numFriendRequests(int[] ages) {
        // 
        int friendRequest = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : ages)
        hm.put(i,hm.getOrDefault(i,0) + 1);
        List<Integer> age = new ArrayList<>(hm.keySet());
        for(int i = 0; i<age.size(); i++)
        {
            for(int j = 0; j<age.size(); j++)
            {
               
                if((age.get(j) <= 0.5 * age.get(i) + 7) || (age.get(j) > age.get(i)) || (age.get(j) > 100 && age.get(i) < 100))
                    continue;
                friendRequest += hm.get(age.get(i)) * (hm.get(age.get(j)) - (age.get(i) == age.get(j) ? 1 : 0));
            }
        }
        return friendRequest;
    }
}
