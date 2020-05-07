class Solution {
    public int minAddToMakeValid(String S) {
        if(S == null || S.length() == 0)
            return 0;
        int ans = 0;
        Stack<Character> stk = new Stack<>();
        for(char ch : S.toCharArray())
        {
            if(ch == '(')
                stk.push(ch);
            else
            {
                if(stk.size() > 0)
                    stk.pop();
                else
                    ans++;
            }
        }
        ans += stk.size();
        return ans;
    }
}
