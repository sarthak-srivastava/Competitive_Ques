class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        if(s == null || s.length() <=1)
            return true;
        int i = 0;
        int j = s.length() - 1;
        while(i<j && i<s.length() && j>=0)
        {   char chi = s.charAt(i);
            char chj = s.charAt(j);
            
            if((Character.isDigit(chi) || (chi<='z' && chi>='a')) && (Character.isDigit(chj)||(chj>='a' && chj<='z')))
            {
                if(chi != chj)
                    return false;
                i++;
                j--;
            }
         if(chi<'a' && chi>'z' && !Character.isDigit(chi))
         {i++;
            }
         if(chj<'a' && chj>'z' && !Character.isDigit(chj))
         { j--;
            }
        }
        return true;
    }
}
