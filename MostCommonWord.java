class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        HashSet<String> ban = new HashSet<String>();
        for(int i = 0; i<banned.length;i++)
            ban.add(banned[i]);
        String[] str = paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ");
        for(int i = 0; i<str.length;i++)
        {
            String tmp = str[i];
            System.out.println(tmp);
                
           
            if(!ban.contains(tmp) && !tmp.equals("") )
            {
            if(hm.containsKey(tmp))
            {
                hm.put(tmp,hm.get(tmp)+1);
            }
            else
                hm.put(tmp,1);
            }
        }
        
        String ans = "";
        int max =Integer.MIN_VALUE;
        for(String i:hm.keySet())
        {   
            // System.out.println(i+" "+hm.get(i));
            if(hm.get(i)>max)
            {
                max = hm.get(i);
                ans = i;
            }
        }
        return ans;
        
    }
}
