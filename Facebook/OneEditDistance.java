public class Solution {
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if they are both one edit distance apart or false
     */
    static int one = 0;
    public boolean isOneEditDistance(String s, String t) {
        // write your code here
        one = 0;
        if(s.length() == 0)
            return false;
        if(t.length() == 0)
            return true;
        if(Math.abs(s.length() - t.length()) > 1)
            return false;
        int flag = 0;
        boolean result = OneEdit(s, t, 0, 0, 0);
        System.out.println(one);
        return  one == 1 || (Math.abs(s.length() - t.length()) == 1) ? result : false;
    }
    public boolean OneEdit(String s, String t, int i, int j, int flag)
    {   if(i == s.length() || j == t.length()){
            return true;
    }
        if(s.charAt(i) == t.charAt(j))
            return OneEdit(s, t, i + 1, j + 1, flag);
        if(flag == 1)
            return false;
        one = 1;
        if(s.length() != t.length())
        return OneEdit(s, t, i + 1, j, 1) || OneEdit(s, t, i, j+ 1, 1);  
        return OneEdit(s, t, i + 1, j + 1, 1);

    }
}
