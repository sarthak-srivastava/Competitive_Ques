class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.length() == 0)
            return word2.length();
        if(word2.length() == 0)
            return word1.length();
        if(word1.equals(word2))
            return 0;
        if(word1.charAt(word1.length()-1) == word2.charAt(word2.length()-1))
            return minDistance(word1.substring(0,word1.length() - 1),word2.substring(0,word2.length() - 1));
            return 1 +Integer.min(minDistance(word1, word2.substring(0,word2.length() - 1)),Integer.min(minDistance(word1.substring(0,word1.length() - 1),word2), minDistance(word1.substring(0,word1.length() - 1),word2.substring(0,word2.length() - 1))));
    }
}
