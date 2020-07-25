class Solution {
    public List<String> generateParenthesis(int n) {
       
        List<String> ans = new ArrayList<>();
        generateParenthesis(n,n,"", ans);
        return ans;
    }
    
    private void generateParenthesis(int op, int cl, String curr, List<String> ans)
    {   if(op > cl)
            return;
        if(op == 0)
        {
            while(cl-- > 0)
                curr = curr + ")";
            ans.add(curr);
            return;
        }
     generateParenthesis(op - 1, cl, curr + "(", ans);
     generateParenthesis(op , cl-1, curr + ")", ans);
     
    }
}
