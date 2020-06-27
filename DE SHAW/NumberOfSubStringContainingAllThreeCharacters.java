class Solution {
    public int numberOfSubstrings(String s) {
        if(s == null || s.length() < 3)
            return 0;
        int ans = 0;
        int[] arr = {0,0,0};
        int i = 0;
        for(int j = 0; j<s.length(); j++)
        {
            char ch = s.charAt(j);
            arr[ch - 'a']++;
            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0)
            { 
              arr[s.charAt(i++) - 'a']--;
            }
            ans += i;
            }
    
        return ans;
}
}
