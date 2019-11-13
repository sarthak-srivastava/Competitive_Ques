class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord == null || beginWord.equals(endWord))
            return 0;
        
        HashSet<String> explored = new HashSet<>();
        explored.add(beginWord);
        HashSet<String> wordDict = new HashSet<>(wordList);
        // wordDict.add(endWord);
        int distance = 1;
        while(!explored.contains(endWord))
        {
            HashSet<String> toAdd = new HashSet<>();
            for(String currStart:explored)
            {
                for(int i = 0; i<currStart.length();i++){
                
                    char[] wordArray = currStart.toCharArray();
                    for(char ch = 'a';ch<='z';ch++)
                {
                    wordArray[i] = ch;
                    String mutate = new String(wordArray);
                    if(!explored.contains(mutate) && wordDict.contains(mutate))
                    {
                        toAdd.add(mutate);
                        wordDict.remove(mutate);
                    }
                }
            }
            }
            if(toAdd.size() == 0)
                return 0;
            distance++;
            explored = toAdd;
            
        }
            return distance;
    }
}
