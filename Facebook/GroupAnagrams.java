class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0)
            return new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0;i<strs.length;i++)
        {   if(hs.contains(strs[i]))
            continue;
            
            hs.add(strs[i]);
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String pat = new String(arr);
            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            for(int j = i+1;j<strs.length;j++)
            {   if(strs[j].length()!=pat.length())
                continue;
                char[] arr_ = strs[j].toCharArray();
                Arrays.sort(arr_);
                String temp = new String(arr_);
                if(temp.equals(pat))
                {
                    curr.add(strs[j]);
                    hs.add(strs[j]);
                }
            }
         ans.add(curr);
        }
        return ans;
    }
}
