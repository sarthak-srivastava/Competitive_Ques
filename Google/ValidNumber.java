
class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0)
            return false;
        s = s.trim();
        if(s.length()==0)
            return false;
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i<10;i++)
            hs.add((char)('0' + i));
        hs.add('e');
        hs.add('+');
        hs.add('-');
        hs.add('.');
        int eflag = 0;
        int decflag = 0;
        int numflag = 0;
        int prevsigne = 0;  // 1 for sign and -1 for e
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            // if(ch == ' ')
            //     continue;
            if(!hs.contains(ch))
                return false;
            else if(ch == '-' || ch == '+')
            {   if(i == s.length() - 1)
                return false;
                if(prevsigne == 0)
                {
                    if(i==0)
                    {   prevsigne = 1;
                        continue;}
                    else
                        return false;
                }
                else if (prevsigne == -1)
                {   prevsigne = 1;
                    continue;}
                else
                    return false;
            }
            else if(ch == 'e')
            {
                if(eflag!=0)
                    return false; // double e
                prevsigne = -1;
                eflag = 1;
                if(i == 0  || i == s.length() - 1 || (numflag == 0 || (s.charAt(i-1)!='.' && (s.charAt(i-1)>'9' || s.charAt(i-1)<'0'))) || ((s.charAt(i+1)!='+' && s.charAt(i+1)!='-')&&(s.charAt(i+1)>'9' || s.charAt(i+1)<'0')))
                {
                    System.out.println("!!");    
                return false;}
            }
            else if(ch == '.')
            {   if(eflag !=0)
                return false;
                if(decflag!=0)
                return false;
                             
                // if(i==0 || i == s.length() - 1)
                //     return false;
                decflag = 1;
            }
            else
            {   prevsigne = 0;

                numflag = 1;}
            
        }
        if(numflag==0)
            return false;
        return true;
    }
}
