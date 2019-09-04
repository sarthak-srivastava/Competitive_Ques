class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> tm = new HashMap<Character, Integer>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<s.length();i++)
        {   char ch = s.charAt(i);
            if(!tm.containsKey(ch))
                tm.put(ch,i);
            else
                tm.put(ch,Integer.MAX_VALUE);
         
        }
        for(char ch: tm.keySet())
        {   int i = tm.get(ch);
            if(i!=Integer.MAX_VALUE)
                ans = Integer.min(ans,i);

        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
