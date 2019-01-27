public class Solution {
    public int lengthOfLongestSubstring(String A) {
        if(A.length()<=1)
        return A.length();
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<A.length())
        {
            if(hm.containsKey(A.charAt(j)))
            {
                i = Math.max(hm.get(A.charAt(j)), i); 
            }
            
                hm.put(A.charAt(j),j+1);
            
            
        ans = Math.max(ans,j-i+1);
        j++;
        }
        // System.out.println(A.substring(i,j));
        return ans;
    } 
}
