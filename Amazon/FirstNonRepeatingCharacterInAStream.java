public class Solution {
    public String solve(String A) {
        if(A == null || A.length()==0)
            return "";
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        q.offer(A.charAt(0));
        sb.append(q.peek());
        int n = A.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put(q.peek(),1);
        for(int i = 1; i<n; i++)
        {
            char curr = A.charAt(i);
            if(!hm.containsKey(curr)){
                q.offer(curr);
                hm.put(curr,1);
        }
            else
                hm.put(curr, hm.get(curr) + 1);
            while(q.size() > 0 && hm.get(q.peek()) > 1)
            {
                q.poll();
            }
            if(q.size() > 0)
                sb.append(q.peek());
            else
                sb.append('#');

        }
        
        return sb.toString();
    }
}
