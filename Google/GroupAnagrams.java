class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a hashmap of frequency map and corresponding set of words
        List<List<String>> ans = new ArrayList<>();
        if(strs == null || strs.length <= 0)
            return ans;
        Map<String,List<String>> hm = new HashMap<>();
        for(String str : strs)
        {
            char[] charMap = new char[26];
            for(char ch : str.toCharArray())
            {
                charMap[ch - 'a']++;
            }
            String skey = String.valueOf(charMap);
            if(!hm.containsKey(skey))
                hm.put(skey, new ArrayList<>());
            hm.get(skey).add(str);
        }
        
        return new ArrayList<>(hm.values()); 
    }
}
