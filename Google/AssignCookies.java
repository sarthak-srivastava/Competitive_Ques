class Solution {
    public int findContentChildren(int[] g, int[] s) {
       if(g == null || s == null || g.length == 0 || s.length == 0) 
           return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookie = 0;
        int res = 0;
        for(int i = 0; i<g.length;i++)
        {
            while(cookie<s.length && g[i]>s[cookie])
            {
                cookie++;
            }
            if(cookie<s.length)
            {
                cookie++;
                res++;
            }
            
        }
        return res;
    }
}
