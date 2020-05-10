public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String str: strs)
        {
            int[] charMap = new int[26];
            for(char ch: str.toCharArray())
            {
                charMap[ch - 'a']++;
            }
            int j = 0;
            StringBuilder sb = new StringBuilder();
            for(int i: charMap)
            {
                String curr = Integer.toString(i) + (char)(j + 97);
                sb.append(curr);
                j++;
            }
            String key = new String(sb);
            if(!hm.containsKey(key))
            {hm.put(key,new ArrayList<>());   
            }
            ArrayList<String> tmp = hm.get(key);
            tmp.add(str);
            hm.put(key,tmp);
        }
        
        for(String key: hm.keySet())
        {   
            List<String> tmp = hm.get(key);
            if(tmp.size() < 2)
                continue;
            for(String i: tmp)
            ans.add(i);
        }
        return ans;
    }
}
