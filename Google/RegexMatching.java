// p[pi] -> . then move si by 1 and pi by 1
// p[pi] -> some character followed by another character, simple match -> return false if nno match else move pi, si by 1
// p[pi] -> some character followed by *
// case 1: character matched 1 or more consecutive occurence of the same character in s
// case 2: character does not match and we take 0 ocurrence of this character and just move pi


class Solution {
    public boolean isMatch(String s, String p) {
       if(p.length() == 0)
           return s.length() == 0;
        boolean first_match = (s.length()!=0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        if(p.length()>1 && p.charAt(1) == '*')
        {
            return (isMatch(s,p.substring(2)) || (first_match && (isMatch(s.substring(1),p))));
        }
        return first_match && isMatch(s.substring(1),p.substring(1));
    }
}
