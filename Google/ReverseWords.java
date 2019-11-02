class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return "";
        s = s.trim();
        String overall = "";
        String curr_word = "";
        int flag = 0;
        for(int i = 0; i<s.length();i++)
        {   char ch = s.charAt(i);
           if(ch!=' ')
             flag = 0;
            if(ch == ' ' && flag==0)
            {
                overall = curr_word + " "+ overall;
                curr_word = "";
                flag = 1;
                continue;
            }
      
            if(ch == ' ' && curr_word.length()<2)
                    continue;
             curr_word = curr_word + ch;
             
         
        }
        return (curr_word +" "+overall).trim();
    }
}
