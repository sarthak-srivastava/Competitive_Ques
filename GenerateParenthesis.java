class Solution {
    public List<String> generateParenthesis(int n) {
        String s = "(";
        List<String> ans = new ArrayList<String>();
        generateParenthesisUtil(n-1,n,ans,s);
        return ans;
    }
    public void generateParenthesisUtil(int n,int cn, List<String> ans, String s)
    {   if(cn<n)
        return;
        if(n == 0)
        {   while(cn>0)
        {s = s+")";
        cn--;}
            ans.add(s);
            return;
        }
        generateParenthesisUtil(n-1,cn,ans,s+'(');
        generateParenthesisUtil(n,cn-1,ans,s+')');
        
    }
}
