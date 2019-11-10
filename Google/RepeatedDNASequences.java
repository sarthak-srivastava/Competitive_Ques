class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if(s == null || s.length() < 10)
        {  
            return ans;}

        String curr = s.substring(0,10);
        HashSet<String> hs = new HashSet<>();
        hs.add(curr);
        HashSet<String> ans_set = new HashSet<>();
        for(int i = 10;i<s.length();i++)
        {
            curr = curr.substring(1) + s.charAt(i);
            if(hs.contains(curr))
            {   if(!ans_set.contains(curr))
                {ans.add(curr);
                    ans_set.add(curr);}
            }
            else
                hs.add(curr);
        }
        // for(String i:hs)
        //     System.out.println(i);
        return ans;
    }
}
