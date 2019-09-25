import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     	 static class TrieNode
	    {
	        int max_char = 26;
	        TrieNode[] children = new TrieNode[max_char];
	        boolean isEndWord;
	        TrieNode()
	        {
	         for(int i = 0; i<max_char; i++)
	         children[i] = null;
	         isEndWord = false;
	        }
	    }
	    public static void prepare(TrieNode root, String[] dic)
	    {   
	        for(int i = 0; i<dic.length;i++)
	        {   TrieNode pcrawl = root;
	            String tmp = dic[i];
	            for(int j= 0; j<tmp.length();j++)
	            {
	                char ch = tmp.charAt(j);
	                int index = ch - 'a';
	                if(pcrawl.children[index]==null)
	                pcrawl.children[index] = new TrieNode();
	                pcrawl = pcrawl.children[index];
	            }
	            pcrawl.isEndWord = true;
	            
	        }
	    }
	    public static int search(TrieNode root, String key)
	    {
	        TrieNode pcrawl = root;
	            String tmp = key;
	            for(int j= 0; j<tmp.length();j++)
	            {
	                char ch = tmp.charAt(j);
	                int index = ch - 'a';
	                if(pcrawl.children[index]==null)
	                return 0;
	                pcrawl = pcrawl.children[index];
	            }
	            
	            if(pcrawl!=null && pcrawl.isEndWord == true)
	            return 1;
	            return 0;
	    }
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     String n = sc.next();
	   //  System.out.println(n);
	     sc.nextLine();
	     String str = sc.nextLine();
	   //  System.out.println(str);
	     String[] dic = str.split(" ");
	     String key = sc.next();
	   //  System.out.println(key);
	     TrieNode root = new TrieNode();
	     prepare(root,dic);
	     System.out.println(search(root,key));
	     
	 }
	 }

	
}