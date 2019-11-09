class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        char ans = ' ';
        for(char ch: s.toCharArray())
        {
            arr[ch - 'a']++;
        }
        for(char ch: t.toCharArray())
        {
            arr[ch - 'a']--;
            if(arr[ch - 'a']<0)
            {   ans = ch;
                return ch;}
        }
        return ans;
    }
}
