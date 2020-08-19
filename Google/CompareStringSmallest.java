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
        char smallest = 'z' + 1;
        int freq = 0;
        for(char ch:str.toCharArray())
        {
         if(ch < smallest)
         {
             smallest = ch;
             freq = 1;
         }
            if(ch == smallest)
            freq += 1;
        }
    return freq;    
    }
    }
