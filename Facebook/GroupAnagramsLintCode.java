public class Solution {
    /**
     * @param strs: the given array of strings
     * @return: The anagrams which have been divided into groups
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // write your code here
        List<List<String>> ans = new ArrayList<>();
        if(strs == null || strs.length == 0)
            return ans;
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String str: strs)
        {
            int[] charFreq = new int[26];
            for(char ch: str.toCharArray())
            {
                charFreq[ch -'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<26; i++)
            {
                sb.append((char)('a'+i ));
                sb.append("_" + charFreq[i] + " ");
            }
            String key = sb.toString();
            if(hm.containsKey(key))
            {
                List<String> curr = hm.get(key);
                curr.add(str);
                hm.put(key,curr);
            }
            else
            {
                List<String> curr = new ArrayList<>();
                curr.add(str);
                hm.put(key,curr);
            }
        }
        for(String key: hm.keySet())
        {
            ans.add(hm.get(key));
        }
        return ans;
        
    }
}
