class Solution {
    public int longestSubstring(String s, int k) {
         if (s == null || s.length() == 0) return 0;
        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i += 1) chars[s.charAt(i) - 'a'] += 1;
        boolean flag = true;
        for (int i = 0; i < chars.length; i += 1) {
            if (chars[i] < k && chars[i] > 0) flag = false;
        }
        if (flag == true) return s.length();
        int result = 0;
        int start = 0, end = 0;
        while (end < s.length()) {
            if (chars[s.charAt(end) - 'a'] < k) {
                result = Math.max(result, longestSubstring(s.substring(start, end), k));
                start = end + 1;
            }
            end++;
        }
        result = Math.max(result, longestSubstring(s.substring(start), k));
        return result;
    }
}
