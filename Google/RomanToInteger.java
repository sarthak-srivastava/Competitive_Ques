class Solution {
    public int romanToInt(String s) {
      int ans = 0;
        for(int i = s.length() - 1; i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch == 'I')
                ans++;
            if(ch == 'V')
                ans += 5;
            if(ch == 'X')
                ans += 10;
            if(ch == 'L')
                ans += 50;
            if(ch == 'C')
                ans += 100;
            if(ch == 'D')
                ans += 500;
            if(ch == 'M')
                ans += 1000;
            
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
