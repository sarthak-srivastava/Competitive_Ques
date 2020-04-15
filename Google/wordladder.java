class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord == null || endWord == null || wordList == null | beginWord.length() != endWord.length())
            return 0;
        int distance = 1;
        Set<String> explored = new HashSet<>();
        explored.add(beginWord);
        Set<String> wordDict = new HashSet<>(wordList);
        while(!explored.contains(endWord))
        {
            Set<String> toAdd = new HashSet<String>();
            for(String str: explored)
            {
                for(int i = 0; i<str.length(); i++)
                {
                    for(char ch = 'a'; ch<='z';ch++)
                    {
                        String temp = str.substring(0,i) + ch + str.substring(i+1);
                        if(!explored.contains(temp) && wordDict.contains(temp))
                        {
                            toAdd.add(temp);
                            wordDict.remove(temp);
                        }
                    }
                    
                }
               
             
            }
             if(toAdd.size() == 0)
                    return 0;
               explored = toAdd;
                distance++;
        }
        return distance;
    }
}
