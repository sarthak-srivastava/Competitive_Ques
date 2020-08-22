public class Solution {
    private class trie
    {   
        boolean isEnd;
        trie[] children;
        int[] freq;
        trie(){isEnd = false;
        children = new trie[26];
        freq = new int[26];
    }
            }
    private void populate(trie root, String word)
    {
        trie curr = root;
        for(char ch: word.toCharArray())
        {   if(curr.children[ch - 'a'] == null)
            curr.children[ch - 'a'] = new trie();
            curr.freq[ch-'a']++;
            curr = curr.children[ch - 'a'];
            
        }
        curr.isEnd = true;
    }
    private boolean isUnique(trie curr, char ch)
    {
        if(curr.isEnd)
            return true;
        int count =0;
        for(int i = 0; i<26; i++)
        {
            if(curr.children[i] != null)
                count+= curr.freq[i];
        }
        // System.out.print(ch + "," + count + " ");
        return count == 1;
        
    }
    public ArrayList<String> prefix(ArrayList<String> A) {
        trie root = new trie();
        for(String word : A)
        {
            populate(root, word);
        }
        ArrayList<String> ans = new ArrayList<String>();
        for(String word: A)
        {   String curr ="";
        
            trie temp = root;
            for(char ch: word.toCharArray())
            {   temp = temp.children[ch - 'a'];
                curr = curr + ch;
                if(isUnique(temp, ch))
                {
                    ans.add(curr);
                    break;
                }
            }
        }
        return ans;
    }
}
