public class Solution {
    /**
     * @param path: the original path
     * @return: the simplified path
     */
    public String simplifyPath(String path) {
        // write your code here
        Stack<String> stk = new Stack<>();
        String[] comp = path.split("/");
   
        for(String i : comp)
        {   if(i.length() == 0){
            stk.add("");
            continue;
        }
            if(i.equals("."))
            continue;
            if(i.equals(".."))
            {
                stk.pop();
                continue;
            }
            stk.push(i);
        }
        StringBuilder sb = new StringBuilder();
        while(stk.size()>0)
        {
            System.out.println(stk.peek());
            String tmp = "/" + stk.pop();
            if( tmp.equals("/"))
                continue;
            sb.insert(0, tmp);
        }
        if(sb.length() == 0)
        return "/";
        
        return new String(sb);
    }
}
