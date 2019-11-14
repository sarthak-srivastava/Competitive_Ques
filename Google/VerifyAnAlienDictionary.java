class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 0)
            return true;
        // for correct ordering, word1[i] < word2[i] < word3[i] ......
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i<order.length();i++)
        {
            hm.put(order.charAt(i),i);
        }
        
        
        for(int i = 0; i<words.length - 1; i++)
        {
            String s1 = words[i];
            String s2 = words[i+1];
            boolean flag = false;
            for(int j = 0; j < Integer.min(s1.length(),s2.length()); j++)
            {   
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    if(hm.get(s1.charAt(j)) > hm.get(s2.charAt(j)))
                        return false;
                    else
                    {flag = true;
                    break;}
                    
                }
                
            }
            if(flag == false && s1.length() > s2.length())
                return false;
        }
        return true;
    }
}
