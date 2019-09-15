class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord == null || beginWord.equals(""))
            return 0;
       HashSet<String> hs = new HashSet<>(wordList);
        // System.out.println(hs);
           HashSet<String> explored = new HashSet<>();

      
    Queue<String> q = new LinkedList<>(); 
        int ans = 1;
        q.add(beginWord);
        q.add("");
        while(q.size()>0)
        {
            String curr = q.remove();
             if(curr.equals("") && q.size() == 0)
                return 0;
            if(curr.equals(""))
            {
                ans++;
                q.add("");
                continue;
            }
            if(curr.equals(endWord))
                return ans;
          
            
            
             // if(hs.size() == explored.size())
             //    return 0;
            // System.out.println("value of curr "+curr);
          for(String dicWord:hs){
              if(!explored.contains(dicWord))
            {
            for(int i = 0; i<beginWord.length();i++)
        { 
            String tmp = curr.substring(0,i)+dicWord.charAt(i)+curr.substring(i+1);
                        // System.out.println(" inside for loop " +tmp+" ");
            if(hs.contains(tmp) && !explored.contains(tmp))
            {q.add(tmp);
            // System.out.println(tmp);
              explored.add(tmp);  }
        }
        }
        }   
        }
        return 0;
    }
}
