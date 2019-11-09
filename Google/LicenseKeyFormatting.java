class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int len = 0;
        String ans = "";
        for(int i = S.length() - 1 ; i>=0;i--)
        {   char ch = S.charAt(i);
            if((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {ans = ((ch>='a' && ch<='z')?(char)(ch - 32):(char)ch) + ans;
            len++;}
            else
                continue;
            if(i>0 && len%K == 0)
                ans = '-' + ans;
        }
        if(ans.length()>0 && ans.charAt(0) == '-')
            return ans.substring(1);
        return ans;
    }
}
