class Solution {
    public class word
    {
        String spell;
        int freq;
        word(int f,String str)
        {
            spell = str;
            freq = f;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<String>();
        if(words == null || k<=0 || words.length == 0)
            return ans;
        HashMap<String,Integer> hm = new HashMap<>();
        for(String str: words)
            hm.put(str,hm.getOrDefault(str,0) + 1);
        PriorityQueue<word> pq = new PriorityQueue<word>(new Comparator<word>(){
            public int compare(word w1, word w2)
            {
                if(w1.freq == w2.freq )
                    return -1 * w1.spell.compareTo(w2.spell);
                return w1.freq - w2.freq;
            }
        });
        int count = 0;
        for(String str: hm.keySet())
        {
            // if(count < k)
            pq.add(new word(hm.get(str),str));
            count++;
            
            while(count > k)
            {
                pq.remove();
                count--;
            }
        }
        System.out.println(pq.size());
        String[] a = new String[count];
        while(pq.size()>0)
        {
            a[count-- - 1] = pq.remove().spell;
        }
        for(String tmp : a)
            ans.add(tmp);
        return ans;
    }
}
