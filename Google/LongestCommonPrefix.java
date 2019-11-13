public class Solution {
    public String longestCommonPrefix(String[] A) {
        String ans = "";
        char ch = ' ';
        int minlen = Integer.MAX_VALUE;
        for(String temp:A)
        {
            minlen = Integer.min(minlen,temp.length());
        }
        for(int j = 0;j<minlen;j++){
        
        for(int i = 0; i<A.length; i++)
        {   
            char curr = A[i].charAt(j);
            if(i == 0)
                ch = curr;
            if(curr!=ch)
                return ans;
        }
        ans = ans + ch;
        }
        return ans;
    }
}
