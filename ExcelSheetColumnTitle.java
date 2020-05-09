public class Solution {
    /**
     * @param n: a integer
     * @return: return a string
     */
    public String convertToTitle(int n) {
        // write your code here
        HashMap<Integer, Character> hm = new HashMap<>();
        for(int i = 0; i< 26; i++)
        {
            hm.put(i,(char)('A' + (i)));
        }
        StringBuilder sb = new StringBuilder("");
        while(n > 0)
        {
            int rem = (n-1)%26;
            n = (n-1)/26;
            sb.insert(0,hm.get(rem));
        }
        return new String(sb);
    }
}
