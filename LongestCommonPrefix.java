class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length <1)
            return "";
        if(strs.length == 1)
            return strs[0];
        if(strs[0].equals(""))
                return "";
        String ans = "";
        int flag = 0;
        int j = 0;
        while(flag==0)
        {   char ch = 'a';
            
            if(strs[0].length()<=j)
                return ans;
            else
                ch = strs[0].charAt(j);
            for(int i = 0; i<strs.length;i++ )
            {
                if(j>=strs[i].length())
                    return ans;
                if(strs[i].charAt(j)!=ch)
                    return ans;
            }
         ans = ans + ch;
         j++;
        }
        return ans;
    }
}
