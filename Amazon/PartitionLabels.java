class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0 )
            return new ArrayList<Integer>();
        int[] LastPos = new int[26];
        for(int i = S.length() - 1; i>= 0; i--)
        {
            char ch = S.charAt(i);
            LastPos[ch - 'a'] = Integer.max(LastPos[ch - 'a'], i);
        }
        List<Integer> ans = new ArrayList<>();
        int curr = 0;
        int next = LastPos[S.charAt(0) - 'a'];
        for(int i = 0; i<S.length(); i++)
        {
            if(i == 0)
            {
                curr = 0;
                next = LastPos[S.charAt(0) - 'a'];
            }
            next = Integer.max(next, LastPos[S.charAt(i) -'a']);
            if(i == next)
            {
                ans.add(i+1 - curr);
                curr = i + 1;
            }
                
        }
        return ans;
    }
}
