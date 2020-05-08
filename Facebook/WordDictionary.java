public class WordDictionary {
    /*
     * @param word: Adds a word into the data structure.
     * @return: nothing
     */
    HashSet<String> hs;
    WordDictionary()
    {
        hs  = new HashSet<>();
    }
    public void addWord(String word) {
        // write your code here
        hs.add(word);
    }

    /*
     * @param word: A word could contain the dot character '.' to represent any one letter.
     * @return: if the word is in the data structure.
     */
    public boolean search(String word) {
        // write your code here
        if(hs.contains(word))
        return true;
        for(String curr: hs)
        {
            if(curr.length() != word.length())
                continue;
            int i = 0;
            for(i = 0; i<curr.length(); i++)
            {
                if(word.charAt(i) == '.')
                    continue;
                if(word.charAt(i) != curr.charAt(i))
                    break;
                
            }
            if(i == curr.length())
                    return true;
        }
        return false;
    }
}
