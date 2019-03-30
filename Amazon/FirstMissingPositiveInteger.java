public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0;i<A.size();i++)
        {   if(A.get(i)>0)
            hs.add(A.get(i));
        }
        int i = 1;
        while(hs.contains(i))
        i++;
        return i;
    }
}
