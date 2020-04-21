class Solution {
    public int romanToInt(String s) {
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
        }
        for(int i = 0; i<s.length() - 1;i++)
        {
            char ch = s.charAt(i);
            if(ch == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
                ans -= 2;
            if(ch == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
                ans -= 20;
            if(ch == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                ans -= 200;
        }
        return ans;
    }
}
