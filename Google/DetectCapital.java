class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() <=1)
            return true;
        boolean prev_cap = true;
        for(int i = 0; i<word.length();i++)
        {
            char ch = word.charAt(i);
            System.out.println(ch+" "+prev_cap);
            if(Character.isUpperCase(ch))
            {
                if(prev_cap == true)
                continue;
                else
                    return false;
            }
            if(!Character.isUpperCase(ch) && prev_cap == true && i-1>0)
                return false;
            prev_cap = false;
                
        }
        return true;
    }
}
