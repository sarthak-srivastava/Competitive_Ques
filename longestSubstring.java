/* Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
             
             https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

class Solution {
    public int lengthOfLongestSubstring(String str) {
     int n = str.length(); 
        int cur_len = 1;    // length of current substring 
        int max_len = 1;    // result 
        int prev_index;        //  previous index 
        int i; 
        int visited[] = new int[256]; 
          
        if(str.length()<=1)
            return str.length();
        for (i = 0; i < 256; i++) { 
            visited[i] = -1; 
        } 
          
  
        visited[str.charAt(0)] = 0; 
          
     
        for(i = 1; i < n; i++) 
        { 
            prev_index = visited[str.charAt(i)]; 
              
     
            if(prev_index == -1 || i - cur_len > prev_index) 
                cur_len++; 
              
       
            else
            { 
    
                if(cur_len > max_len) 
                    max_len = cur_len; 
                  
                cur_len = i - prev_index; 
            } 
              
            visited[str.charAt(i)] = i; 
        } 

        if(cur_len > max_len) 
            max_len = cur_len; 
          
        return max_len; 
    }
}
