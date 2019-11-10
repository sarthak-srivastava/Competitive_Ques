class Solution {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0)
            return "";
        Character[] chArray = new Character[s.length()];
        int i = 0;
        for(;i<s.length();i++)
        {
            chArray[i] = s.charAt(i);
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: chArray)
        {
            int freq = hm.getOrDefault(ch,0);
            hm.put(ch,freq + 1);
        }
        
        Arrays.sort(chArray, new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                int comp = hm.get(c2) - hm.get(c1);
                if(comp == 0)
                    return c2 - c1;
                else
                    return comp;
            }
        });
        StringBuilder ans = new StringBuilder();
        for(Character ch:chArray)
        {
            ans = ans.append(ch);
        }
        return new String(ans);
        
    }
}
