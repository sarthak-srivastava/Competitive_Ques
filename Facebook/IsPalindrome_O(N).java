public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if(s.length() == 1)
            return true;

        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while(i < j)
        {   char chbeg = s.charAt(i);
            char chend = s.charAt(j);
            int flag = -1;
            while(!Character.isLetterOrDigit(chbeg)){
                if(i+1 <s.length())
                chbeg = s.charAt(++i);
                else{flag = 1;
                    break;}
                if(i > j){flag = 1;
                break;}
            }
            while(!Character.isLetterOrDigit(chend)){
                if((j-1) >=0 )
                {j -= 1;
                chend = s.charAt(j);}
                else{flag = 1;
                    break;
                }
                if(i > j){flag = 1;
                break;}
            }
            if(flag == 1)
                break;
            if(chend != chbeg)
                return false;
            i++;
            j--;

        }
        return true;
    }
}
