class Solution {
    public int balancedStringSplit(String s) {
        int lcr = 0;
        int rcr = 0;
        
        int ans = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'L')
                lcr++;
            if(ch == 'R')
                rcr++;
            if(lcr == rcr)
                ans++;
        }
        
        return ans;
    }
}
