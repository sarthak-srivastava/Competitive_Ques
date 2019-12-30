import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  public static class TrieNode{
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
static class Trie {
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
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-- > 0)
	 {
	     int n = sc.nextInt();
	     String[] dictionary = new String[n];
	     for(int i = 0; i<n;i++)
	     dictionary[i] = sc.next();
	     String word = sc.next();
	   //  dictionary = dic.split(" ");
	     Trie trie = new Trie();
	     for(String words: dictionary)
	     {
	         trie.insert(words);
	     }
	     System.out.println(trie.search(word) == true ? 1: 0);
	 }
	 }
}

