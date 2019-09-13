class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stk.push(ch);
            if(stk.size()==0)
                return false;
            if(ch == ')')
            {
                char t = stk.pop();
                if(t!='(')
                    return false;
            }
            if(ch ==']')
            {
                char t = stk.pop();
                if(t!='[')
                    return false;
            }
              if(ch =='}')
            {
                char t = stk.pop();
                if(t!='{')
                    return false;
            }
            
            
        }
        if(stk.size()==0)
        return true;
        return false;
    }
}
