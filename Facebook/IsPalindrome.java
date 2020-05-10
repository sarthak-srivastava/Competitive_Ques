public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if(s.length() == 1)
            return true;
        s = s.toLowerCase();

     
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            sb.append(ch);
        }
        int j = sb.length() - 1;
        while(i<j)
        {
            if(sb.charAt(i) != sb.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
