public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i = 0; i<A.size(); i++)
       {
        if(hm.containsKey(A.get(i)))
        {
            if(hm.get(A.get(i)) + 1 > Math.floor(A.size()/2))
            return A.get(i);
            hm.put(A.get(i),hm.get(A.get(i))+1);
        }
        else
        {
        hm.put(A.get(i),1);
        if(hm.get(A.get(i)) > Math.floor(A.size()/2))
            return A.get(i);
            
        }
       }
       return -1;
       
    }
}
