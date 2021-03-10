public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        if(A == null || A.size() <2)
            return 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i<A.size(); i++)
        {
            if(hs.contains(B + A.get(i)) || hs.contains(A.get(i) - B))
                return 1;
            hs.add(A.get(i));
        }
        return 0;
        
    }
}
