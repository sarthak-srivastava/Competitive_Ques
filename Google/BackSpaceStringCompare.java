class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(char ch:S.toCharArray())
        {
            if(ch!='#')
                sStack.push(ch);
            else
                if(sStack.size()>0)
                    sStack.pop();
        }
        for(char ch:T.toCharArray())
        {
            if(ch!='#')
                tStack.push(ch);
            else
                if(tStack.size()>0)
                    tStack.pop();
        }
        if(sStack.size()!=tStack.size())
            return false;
        while(sStack.size()!=0 && tStack.size()!=0)
        {
            char sch = sStack.pop();
            char tch = tStack.pop();
            if(sch!=tch)
                return false;
        }
        return (sStack.size() == tStack.size());
    }
}
