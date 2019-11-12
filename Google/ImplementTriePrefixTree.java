public class TrieNode{
    char val;
    TrieNode[] children;
    boolean isEnd;
    TrieNode(char c)
    {
        this.val = c;
        this.children = new TrieNode[26];
        this.isEnd = false;
    }
}
class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(' ');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i<word.length(); i++)
        {
            char curr_ch  = word.charAt(i);
            if(curr.children[curr_ch - 'a'] == null)
            {
                curr.children[curr_ch - 'a'] = new TrieNode(curr_ch);
            }
            curr = curr.children[curr_ch - 'a'];
            }
        curr.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i<word.length();i++)
        {
            char curr_ch = word.charAt(i);
            if(curr.children[curr_ch - 'a'] == null)
                return false;
            curr = curr.children[curr_ch - 'a'];
        }
        
        return curr.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
           TrieNode curr = root;
        for(int i = 0; i<prefix.length();i++)
        {
            char curr_ch = prefix.charAt(i);
            if(curr.children[curr_ch - 'a'] == null)
                return false;
            curr = curr.children[curr_ch - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
