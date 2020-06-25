public class Solution {
    /**
     * @param s: Roman representation
     * @return: an integer
     */
    public int romanToInt(String s) {
        // write your code here
        if(s == null || s.length() == 0)
            return 0;
        int ans = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            switch(ch){
                case 'I':
                    ans += 1;
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    ans += 10;
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    ans += 100;
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
         
            }
           if(i+1 < s.length())
            {
            char tmp = s.charAt(i+1);
            if(ch == 'I' && (tmp == 'V' || tmp == 'X'))
                ans -= 2;
            if(ch == 'X' && (tmp == 'L' || tmp == 'C'))
                ans -= 20;
            if(ch == 'C' && (tmp == 'D' || tmp == 'M'))
                ans -= 200;
        }
        }
       
        return ans;
    }
}
