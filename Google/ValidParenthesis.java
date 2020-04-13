class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length()<1)
            return true;
        if(s.length()%2==1)
            return false;
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '{' || ch == '[' || ch == '(')
                stk.push(ch);
            else
                if(stk.size() <= 0)
                    return false;
                if(ch == '}' && stk.pop() != '{')
                    return false;
                if(ch == ']' && stk.pop() != '[')
                    return false;
                if(ch == ')' && stk.pop() != '(')
                    return false;
        }
        return stk.size() == 0;
    }
}
