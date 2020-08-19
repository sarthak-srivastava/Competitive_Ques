class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] wordfreq = new int[words.length];
        int it = 0;
        for(String word:words)
        {
            wordfreq[it++] = smallestFreq(word);
        }
        for(int i = 0; i<ans.length; i++)
        {
            int c = 0;
            String query = queries[i];
            int queryFreq = smallestFreq(query);
            for(int j = 0; j<wordfreq.length; j++)
            {
                
                if(wordfreq[j] > queryFreq)
                    c++;
            }
            ans[i] = c;
        }
        return ans;
    }
    private int smallestFreq(String str)
    {
        HashMap<Character, Integer> tm = new HashMap<Character, Integer>();
        for(char ch: str.toCharArray())
        {
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }
        for(char ch = 'a'; ch <= 'z'; ch++)
            if(tm.containsKey(ch)) return tm.get(ch);
        return 0;
    }
    }
