class Solution {
    public boolean checkValidString(String s) {
       Stack<Integer> par = new Stack<>();
        Stack<Integer> ast = new Stack<>();
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                par.push(i);
            }
            if(ch == '*')
                ast.push(i);
            if(ch == ')')
            {
                if(par.size() == 0 && ast.size() == 0)
                    return false;
                if(par.size()!=0)
                    par.pop();
                else
                    ast.pop();
                    
            }
        }
        while(par.size()>0 && ast.size()>0 && par.peek()<ast.peek())
        {
            par.pop();
            ast.pop();
        }
        return par.size()==0;
    }
}
